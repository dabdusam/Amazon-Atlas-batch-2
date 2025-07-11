public class Day16task03 {

    // Insertion Sort method
    public static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int next = a[i];  // The element to be inserted
            int j = i - 1;

            // Shift elements to the right to make space for 'next'
            while (j >= 0 && a[j] > next) {
                a[j + 1] = a[j];
                j--;
            }

            // Insert 'next' at the correct position
            a[j + 1] = next;
        }
    }

    // Main method to test the sort
    public static void main(String[] args) {
        int[] a = {1, 20, 11, 35, 2};
        int n = a.length;

        System.out.print("Original array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }

        insertionSort(a, n);  // Perform sorting

        System.out.print("\nSorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

