public class Day12task01 {
    public static void main(String[] args) {
        // Original array
        int[] arr = {5, 6, 7, 8, 9};

        // Print original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array in-place
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

