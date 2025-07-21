package Functions;


// Use bit manipulation (left shift) to subtract large multiples of the divisor.

// Handle signs carefully.

// Take care of overflow, especially Integer.MIN_VALUE / -1.


public class DivideTwoIntegers {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.divide(10, 3));      // Output: 3
        System.out.println(sol.divide(7, -3));      // Output: -2
        System.out.println(sol.divide(-15, 4));     // Output: -3
        System.out.println(sol.divide(-2147483648, -1)); // Output: 2147483647 (overflow case)
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Determine sign of result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert to long and take absolute values
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long result = 0;

        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }

        return isNegative ? (int)(-result) : (int)(result);
    }
}
