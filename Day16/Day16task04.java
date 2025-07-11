public class Day16task04 {

    // Recursive method to calculate sum from n down to 0
    public int calc(int n) {
        if (n == 0) return 0;            // Base case
        return n + calc(n - 1);          // Recursive case with decreasing n
    }

    public static void main(String[] args) {
        Day16task04 rl = new Day16task04();

        int number = 5;  // You can change this value for other tests
        int result = rl.calc(number);

        System.out.println("Sum from " + number + " to 0 is: " + result);
    }
}
