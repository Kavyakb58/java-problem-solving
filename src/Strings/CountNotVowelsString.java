package Strings;

import java.util.Scanner;

public class CountNotVowelsString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String: " + s);
        int count=0;
        for(int i=0; i<=s.length()-1; i++){
            char m=s.charAt(i);
            if(m!='a' && m!='e' && m!='i' && m!='o' && m!='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

