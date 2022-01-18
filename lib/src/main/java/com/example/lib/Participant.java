package com.example.lib;

public class Participant extends Person {
    public int CardID;

    public Participant(String fn, int ph, int id)
    {
        super(fn, ph);
        CardID = id;
    }
}
