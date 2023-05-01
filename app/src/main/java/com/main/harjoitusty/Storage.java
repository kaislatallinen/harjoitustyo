package com.main.harjoitusty;

import java.util.ArrayList;

public class Storage {
    private final ArrayList<Lutemon> Lutemons = new ArrayList<>();

    private static Storage storage = null;

    private Storage() {

    }
    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }
    public void addLutemon(Lutemon lutemon) {
        Lutemons.add(lutemon);
    }

    public ArrayList<Lutemon> getLutemons() {
        return Lutemons;
    }

}
