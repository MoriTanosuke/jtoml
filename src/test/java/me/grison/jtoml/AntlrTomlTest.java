package me.grison.jtoml;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Junit test for {@link AntlrToml} using the toml "spec" from mojombo.
 * (https://github.com/mojombo/toml).
 * 
 * @author $Author: Carsten Ringe$
 */
public class AntlrTomlTest extends BaseTomlTest {

    private AntlrToml toml;

    @Test
    public void testTopLevelString() {
        // title = "TOML Example"
        assertEquals("TOML Example", toml.getString("title"));
    }

    @Test
    public void testNestedStrings() {

        // [owner]
        // name = "Tom Preston-Werner"
        // organization = "GitHub"
        assertEquals("Tom Preston-Werner", toml.getString("owner.name"));
        assertEquals("GitHub", toml.getString("owner.organization"));
    }

    @Test
    public void testNewlineAndHashInString() {

        // [owner]
        // bio = "GitHub Cofounder & CEO\nLikes tater tots and beer #awesome."
        assertEquals(
                "GitHub Cofounder & CEO\nLikes tater tots and beer #awesome.",
                toml.getString("owner.bio"));
    }

    @Test
    public void testDate() throws ParseException {
        // dob = 1979-05-27T07:32:00Z # First class dates? Why not?
        assertEquals(
                createCalendar("yyyy-MM-dd-HH:mm:ssZ",
                        "1979-05-27-07:32:00-0000").getTime().getTime(), toml.getDate("owner.dob").getTime().getTime());
    }

    @Test
    public void testArray() {

        // [database]
        // server = "192.168.1.1"
        // ports = [ 8001, 8001, 8002 ]
        assertEquals("192.168.1.1", toml.get("database.server"));
        List<Object> elements = toml.getList("database.ports");
        assertEquals(
                createList(Integer.valueOf(8001), Integer.valueOf(8001),
                        Integer.valueOf(8002)), elements);
    }

    @Test
    public void testInteger() {
        // [database]
        // connection_max = 5000
        // latency_max = 42 # this is in milliseconds
        assertEquals(Integer.valueOf(5000),
                toml.getInt("database.connection_max"));
        assertEquals(Integer.valueOf(42), toml.getInt("database.latency_max"));
    }

    @Test
    public void testBoolean() {
        // [database]
        // enabled = true
        // awesome = false # just because
        assertEquals(Boolean.valueOf(true), toml.getBoolean("database.enabled"));
        assertEquals(Boolean.valueOf(false),
                toml.getBoolean("database.awesome"));
    }

    @Test
    public void testIndentationDoesntMatter() {
        // [servers]
        //
        // # You can indent as you please. Tabs or spaces. TOML don't care.
        // [servers.alpha]
        // ip = "10.0.0.1"
        // dc = "eqdc10"
        assertEquals("10.0.0.1", toml.get("servers.alpha.ip"));
        assertEquals("eqdc10", toml.get("servers.alpha.dc"));

        // [servers.beta]
        // ip = "10.0.0.2"
        // dc = "eqdc10"
        assertEquals("10.0.0.2", toml.get("servers.beta.ip"));
        assertEquals("eqdc10", toml.get("servers.beta.dc"));
    }

    @Test
    public void testArrayOfArrays() {
        // [clients]
        // data = [ ["gamma", "delta"], [1, 2] ] # just an update to make sure
        // parsers support it
        assertEquals(ExampleTomlTest.<Object> createList(
                createList("gamma", "delta"),
                createList(Integer.valueOf(1), Integer.valueOf(2))),
                toml.getList("clients.data"));
    }

    @Test
    public void testSecondLevelSectionString() throws FileNotFoundException {
        assertEquals("10.0.0.2", toml.getString("servers.beta.ip"));
    }

    @Before
    public void setUp() throws FileNotFoundException {
        toml = new AntlrToml();
        toml.parseFile(new File("src/test/resources/example.toml"));
    }

}
