package Arrays.java;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int evenCount=0;
        int oddCount=0;
        int[] arr=new int[size];
        System.out.println("Enter array: ");
        for(int i=0; i< arr.length; i++) {
            arr[i]= sc.nextInt();
        }
         for(int i=0; i<=arr.length-1; i++){
             if(arr[i]%2==0){
                 evenCount++;
             }
             else {
                 oddCount++;
             }
         }
        System.out.println("Even Count: " +evenCount);
        System.out.println("odd Count: " +oddCount);
    }
}
