package Arrays.java;

import java.util.Scanner;

public class SecondLargestInArray
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size=sc.nextInt();
        System.out.println("Enter a array elements: ");
        int[] arr=new int[size];
        for(int i=0; i<=arr.length-1; i++){
            arr[i]=sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>largest){
                second=largest;
                largest= arr[i];
            }
            else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all values same)");
        } else {
            System.out.println("Second largest element: " + second);
        }
    }
}
