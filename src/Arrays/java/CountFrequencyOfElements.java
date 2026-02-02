package Arrays;

import java.util.Scanner;

public class CountFrequencyOfElements {
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

        for (int i = 0; i < size; i++) {

            // 🔹 check if already processed
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // 🔹 count frequency
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}
