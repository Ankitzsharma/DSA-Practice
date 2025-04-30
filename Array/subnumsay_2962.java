package Array;

// 2962. Count Subnumsays Where Max Element Appears at Least K Times
// You are given an integer numsay nums and a positive integer k.

// Return the number of subnumsays where the maximum element of nums appears at least k times in that subnumsay.

// A subnumsay is a contiguous sequence of elements within an numsay.

 

// Example 1:

// Input: nums = [1,3,2,3,3], k = 2
// Output: 6
// Explanation: The subnumsays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
// Example 2:

// Input: nums = [1,4,2,1], k = 3
// Output: 0
// Explanation: No subnumsay contains the element 4 at least 3 times.



public class subnumsay_2962 {

    public static void solution(int nums[], int k){
        int maxSum=0;
        int arr=0;
        for(int i=0;i<nums.length;i++){
            for (int j = i; j < nums.length; j++) {
                System.out.print("( ");
                // int sum=0;
                int count=0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(nums[j2]+",");
                    // sum+=nums[j2];
                    if(nums[j2]==3){
                        count++;
                    }
                    if(count == k){
                        arr++;
                    }
                }
                System.out.println(" )");
                // if(sum>maxSum){
                //     maxSum=sum;
                // }
            }
            System.out.println();
        }
        System.out.println("MaxSum Is: "+arr);
    }

    public static void main(String[] args) {
        int nums[]={61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
        int k=2;
        solution(nums, k);
        // System.out.println("numsay: "+solution(nums, k));
    }
}
