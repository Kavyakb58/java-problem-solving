package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

     int[] res=new int[size];
        int k=0;
        for(int i=0; i<arr.length; i++){
            boolean duplicate=false;
            for(int j=0; j<k; j++){
                if(arr[i]==res[j]){
                    duplicate=true;
                    break;
                }
            }
            if (!duplicate) {
                res[k++]=arr[i];

            }

        }
    }
}
