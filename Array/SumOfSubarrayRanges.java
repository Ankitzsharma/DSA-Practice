package Array;

// You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
// Return the sum of all subarray ranges of nums.
// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:

// Input: nums = [1,2,3]
// Output: 4
// Explanation: The 6 subarrays of nums are the following:
// [1], range = largest - smallest = 1 - 1 = 0 
// [2], range = 2 - 2 = 0
// [3], range = 3 - 3 = 0
// [1,2], range = 2 - 1 = 1
// [2,3], range = 3 - 2 = 1
// [1,2,3], range = 3 - 1 = 2
// So, the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.


public class SumOfSubarrayRanges {
    public static long subArrRanges(int nums[]){
        long ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int minV=nums[i];
            int maxV=nums[i];
            for(int j=i;j<n;j++){
                minV=Math.min(minV,nums[j]);
                maxV=Math.max(maxV,nums[j]);
                ans+=maxV-minV;
            }
            
        }
        return ans;
    
    }
    public static void main(String[] args){
        int nums[]={1,2,3};
        System.out.println("Sum of SubArray Ranges Sum Is : "+subArrRanges(nums));
        
    }
}
