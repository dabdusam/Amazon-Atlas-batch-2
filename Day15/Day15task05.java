public class Day15task05 {
    public static void main(String[] args)
    {        // Define arrays for edges
        int[] from = {1, 1, 1, 2, 2, 3, 3, 4};
        int[] to = {2, 3, 4, 4, 5, 4, 5, 5};
        System.out.println("Graph edges are:");
// Display edges
        for (int i = 0; i < 8; i++)
        {
            System.out.println(from[i] + " - " + to[i]);
        }
    }
}