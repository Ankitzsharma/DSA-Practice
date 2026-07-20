package DP;

import java.util.Arrays;

public class ClimbingStairs {

    // public static int countWays(int n){   // T.C -> (2^n) Using This / Recursion Way , slow
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n<0){
    //         return 0;
    //     }

    //     return countWays(n-1) + countWays(n-2);
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     System.out.println("Number Of Ways Are : "+ countWays(n));
    // }


    // Optimized/Memoization Ways to Calculate The Ways

    public static int countWays(int n, int ways[]){    // Using This/Memoization way TC -> O(N), Fast
        if(n==0) return 1;

        if(n<0) return 0;

        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }

    public static void main(String[] args) {
        int n=7;
        int Ways[] = new int[n+1];
        Arrays.fill(Ways, -1);
        System.out.println("Number Of Ways Are : " + countWays(n, Ways));
    }
}
