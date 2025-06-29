import java.util.Arrays;

public class Day12task04 {
    public static void main(String[] args) {
        // Two unsorted arrays
        int[] arr1 = {34, 11, 75, 66};
        int[] arr2 = {100, 5, 1, 50, 89, 19};

        int n1 = arr1.length;
        int n2 = arr2.length;

        // Step 1: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 2: Create merged array
        int[] merge = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Step 3: Merge sorted arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        // Add remaining elements
        while (i < n1) {
            merge[k++] = arr1[i++];
        }

        while (j < n2) {
            merge[k++] = arr2[j++];
        }

        // Print arrays
        System.out.print("Sorted Array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.print("\nSorted Array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        System.out.print("\nMerged Sorted Array: ");
        for (int num : merge) {
            System.out.print(num + " ");
        }
    }
}

