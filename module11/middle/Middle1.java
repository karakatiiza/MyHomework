package com.varaxina.module11.middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String[] words = text.split("[\\s,.:;!?()\"-]+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " [" + map.get(key) + "]");
        }
    }
}

