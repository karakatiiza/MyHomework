package com.varaxina.module12.hard;

import java.io.PrintWriter;

public class Hero {
    private String name;
    private PrintWriter writer;

    public Hero(String name, PrintWriter writer) {
        this.name = name;
        this.writer = writer;
    }

    public void go(String to) {
        writer.println(name + " был в " + to);
    }

    public void eat(String meal) {
        writer.println(name + " ел " + meal);
    }

    public void talk(String smbd) {
        writer.println(name + " разговаривал с " + smbd);
    }
}

