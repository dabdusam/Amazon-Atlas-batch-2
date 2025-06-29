import java.util.Arrays;

public class Day12task03 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7};
        int n1 = arr1.length;

        int[] arr2 = {1, 2, 3, 8, 9, 10};
        int n2 = arr2.length;

        int[] merge = new int[n1 + n2];
        System.out.println(Arrays.toString(merge));// Array to store the merged result
        int i = 0, j = 0, k = 0;

        // Print Array 1
        System.out.print("Array 1: ");
        for (int x = 0; x < n1; x++) {
            System.out.print(arr1[x] + " ");
        }

        // Print Array 2
        System.out.print("\nArray 2: ");
        for (int x = 0; x < n2; x++) {
            System.out.print(arr2[x] + " ");
        }

        // Merge the two sorted arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1 (if any)
        while (i < n1) {
            merge[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2 (if any)
        while (j < n2) {
            merge[k++] = arr2[j++];
        }

        // Print merged array
        System.out.print("\nArray after merging: ");
        for (int x = 0; x < n1 + n2; x++) {
            System.out.print(merge[x] + " ");
        }
    }
}

