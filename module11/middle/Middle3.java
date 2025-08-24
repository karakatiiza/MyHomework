package com.varaxina.module11.middle;

import java.util.*;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
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

        String mostFrequent = null;
        int maxCount = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mostFrequent = key;
            }
        }
        System.out.println("Самое часто встречаемое слово: " + mostFrequent);
    }
}
