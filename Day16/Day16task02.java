public class Day16task02 {

    // Bubble Sort method
    public static void bubbleSort(int[] a, int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (a[j - 1] > a[j]) {
                    // Swap if they are out of order
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int[] a = {29, 10, 14, 37, 13};
        int n = a.length;

        System.out.print("Original array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }

        bubbleSort(a, n);  // Perform sorting

        System.out.print("\nSorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

