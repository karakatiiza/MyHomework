package com.varaxina.module7.middle4;

public class Frog {
    String name;
    int jumpCount;
    CorrectString correctString = new CorrectString();

    public Frog(String name) {
        this.name = name;
        this.jumpCount = 0;
    }

    public void jump(int steps) {
        jumpCount += steps;
        System.out.println(name + correctString.toString(steps) + "Всего прыжков: " + jumpCount);
    }

    public int getJumpCount() {
        return jumpCount;
    }

    public String getName() {
        return name;
    }
}
