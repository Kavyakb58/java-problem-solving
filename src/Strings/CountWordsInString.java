package Strings;

import java.util.Scanner;

public class CountWordsInString
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("String: " + s);
    String[] s1=s.trim().split("\\s+");
    if (s.trim().isEmpty()) {
        System.out.println("Count of Words Is: 0");
    }
    else
    {
        System.out.println("Count of Words Is: " + s1.length);
    }
  }
}
