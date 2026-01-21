package Arrays.java;

import java.util.Scanner;
import java.util.Arrays;


public class ReverseArrayElements
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] rev = new int[arr.length];
        int index = 0;
        System.out.println("Enter the array elements: ");
        for(int i=0; i<=arr.length-1; i++){
            arr[i]=sc.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[index++] = arr[i];
        }
        System.out.println("Reversed array: " + Arrays.toString(rev));


    }
}
