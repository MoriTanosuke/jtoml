package me.grison.jtoml;

import java.io.File;
import java.io.FileNotFoundException;

public interface Toml extends Parser, Getter {

    public abstract Toml parseString(String string);

    public abstract Toml parseFile(File file) throws FileNotFoundException;

}