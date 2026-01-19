package Strings;

import java.util.Scanner;

public class StringPalindromeOrNot
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("String: "+s);
        String rem="";
        for(int i=s.length()-1; i>=0; i--){
            rem=rem+s.charAt(i);
        }
        if(rem.equals(s)) {
            System.out.println(s + " is Pallindrome");
        }
            else{
                System.out.println(s+ " is not Pallindrome");
            }
        }
    }

