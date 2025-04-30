package Array;

// 2962. Count Subarrays Where Max Element Appears at Least K Times
// You are given an integer array nums and a positive integer k.

// Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.

// A subarray is a contiguous sequence of elements within an array.

 

// Example 1:

// Input: nums = [1,3,2,3,3], k = 2
// Output: 6
// Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
// Example 2:

// Input: nums = [1,4,2,1], k = 3
// Output: 0
// Explanation: No subarray contains the element 4 at least 3 times.



public class subarray_2962 {

    public static void solution(int nums[], int k){
        int p=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.print("[ ");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(nums[j2]+",");
                    if(nums[j2]==3){
                        p++;
                        if(p==k){
                            System.out.print(p);
                        }else continue;
                    }
                }
                System.out.print(" ] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[]={1,3,2,3,3};
        int k=2;
        solution(nums, k);
        // System.out.println("Array: "+solution(nums, k));
    }
}
