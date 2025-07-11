public class Day16task01 {

    // Method to perform Selection Sort
    public static void selectionSort(int[] a, int n) {
        for (int i = n - 1; i >= 1; i--) {
            int maxIdx = i;

            // Find the maximum in a[0..i]
            for (int j = 0; j < i; j++) {
                if (a[j] >= a[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Swap a[i] with a[maxIdx]
            int temp = a[i];
            a[i] = a[maxIdx];
            a[maxIdx] = temp;
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int n = a.length;

        selectionSort(a, n);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

