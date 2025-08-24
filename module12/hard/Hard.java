package com.varaxina.module12.hard;

import java.io.PrintWriter;

public class Hard {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter("journal.txt");

        Hero hero = new Hero("Васечкин", writer);

        hero.go("кино");
        hero.eat("пельмени");
        hero.talk("друзьями");
        hero.go("школу");
        hero.eat("мороженое");

        writer.close();
    }
}
