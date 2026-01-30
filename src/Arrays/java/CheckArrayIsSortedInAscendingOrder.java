package Arrays.java;

import java.util.Scanner;

public class CheckArrayIsSortedInAscendingOrder
{
    public static void main(String[] args){

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

        boolean isSorted = true;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}