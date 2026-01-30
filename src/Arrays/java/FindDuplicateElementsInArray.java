package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElementsInArray {
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

        int[] res = new int[size];
        int k = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // check if arr[i] appears again
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // check if already added to res array
            if (isDuplicate) {
                boolean alreadyAdded = false;

                for (int d = 0; d < k; d++) {
                    if (res[d] == arr[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    res[k++] = arr[i];
                }
            }
        }

        int[] finalResult = Arrays.copyOf(res, k);
        System.out.println("Duplicate elements: " + Arrays.toString(finalResult));
    }
}
