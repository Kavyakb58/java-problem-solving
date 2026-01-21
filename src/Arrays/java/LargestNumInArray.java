package Arrays.java;

import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter array: ");
        for(int i=0; i<=arr.length-1; i++)
        {
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
         for(int i=1; i<=arr.length-1; i++){
             if(arr[i]>largest){
                 largest=arr[i];
             }
         }
         System.out.println(largest);
    }
}
