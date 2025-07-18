import java.util.Arrays;

public class Day18task06 {

    // Utility function to get the maximum number
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Counting Sort based on a specific digit (exp = 1, 10, 100...)
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10]; // count array for digits 0-9

        // Count occurrences of each digit at current exp place
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (traverse backwards for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy sorted output back to original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main radix sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Apply counting sort for every digit place
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 1, 802, 24, 2, 66};

        System.out.println("Original Array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}

