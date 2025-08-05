package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int size = 1 << n; // 2^n
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        GrayCode sol = new GrayCode();
        int n = 2; // change n to test other cases
        List<Integer> grayCodes = sol.grayCode(n);
        System.out.println("Gray codes for n = " + n + ": " + grayCodes);
    }
}
