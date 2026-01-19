package Strings;

import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String: " +s);
        String m=s.replaceAll("\\s+","");
        System.out.println(m);
    }
}
