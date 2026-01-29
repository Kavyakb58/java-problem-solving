package Arrays.java;

import java.util.Scanner;

public class SmallestElementInArray
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size=sc.nextInt();
        System.out.println("Enter array elements");
        if (size == 0) {
            System.out.println("Array is empty. No smallest element.");
            return;
        }
        int[] arr=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element in Array is: " +smallest);
    }
}
