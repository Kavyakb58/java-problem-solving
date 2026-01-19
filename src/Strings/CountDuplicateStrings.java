package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateStrings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String: " + s);
        Map<Character,Integer> m=new HashMap<>();
        // Count character frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
