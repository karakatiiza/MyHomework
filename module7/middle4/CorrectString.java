package com.varaxina.module7.middle4;

public class CorrectString {
    public String toString(int steps) {
        if (steps == 1) {
            return  " прыгнула на 1 шаг. ";
        } else if (steps < 5) {
            return " прыгнула на " + steps + " шага. ";
        } else {
            return " прыгнула на " + steps + " шагов. ";
        }
    }
}
