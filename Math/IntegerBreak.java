package Math;

public class IntegerBreak {
    // Greedy method for integer break.
    public int integerBreak(int n) {
        if (n <= 3) return n - 1;
        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        return result * n;
    }

    public static void main(String[] args) {
        IntegerBreak sol = new IntegerBreak();

        int[] testCases = {2, 3, 4, 5, 8, 10};
        for (int n : testCases) {
            int maxProduct = sol.integerBreak(n);
            System.out.println("n = " + n + " --> Maximum product: " + maxProduct);
        }
    }
}
