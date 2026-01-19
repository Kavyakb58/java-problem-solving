package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Before Reverse: " +s);
        String rem="";
        for(int i=s.length()-1; i>=0; i--){
           rem=rem+s.charAt(i);
        }
        System.out.println("After Reverse: " +rem);
    }

}
