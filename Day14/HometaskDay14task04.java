public class HometaskDay14task04 {

    // Recursive function to search for a key in the array
    public static int search(int[] arr, int index, int key) {
        // Base case: if end of array is reached
        if (index >= arr.length) {
            return -1; // not found
        }

        // If element is found
        if (arr[index] == key) {
            return index; // return position
        }

        // Recursive call to check next element
        return search(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int result = search(arr, 0, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

