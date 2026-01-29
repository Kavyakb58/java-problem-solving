package Arrays.java;

import java.util.Scanner;

public class SumAndAvgOfArrayElements
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array elements: ");
        if (size == 0) {
            System.out.println("Array is empty. No smallest element.");
            return;
        }
        int[] arr=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        int noOfElement=arr.length;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        int avg=sum/noOfElement;
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
    }
}
