package Strings;

import java.util.Scanner;

public class RemoveSpecialCharactersFromString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String: " +s);
        String m= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("String: " +m);
    }
}
