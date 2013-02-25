package me.grison.jtoml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class BaseTomlTest {

    protected static Calendar createCalendar(String pattern, String value)
            throws ParseException {
                Date date = new SimpleDateFormat(pattern).parse(value);
                Calendar calendar = GregorianCalendar.getInstance();
                calendar.setTime(date);
                return calendar;
            }

    protected static <T> List<T> createList(T... elements) {
        return Arrays.<T> asList(elements);
    }

    public BaseTomlTest() {
        super();
    }

}