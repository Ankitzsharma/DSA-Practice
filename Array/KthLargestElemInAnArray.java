package Array;

import java.util.PriorityQueue;

// Question :  Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5

public class KthLargestElemInAnArray {

    public static int findKthLargest(int nums[], int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();  //remove smallest
            }
        } 
        return pq.peek();   //root of heap is kth largest
    }

    public static void main(String[] args){
        KthLargestElemInAnArray sc=new KthLargestElemInAnArray();
        int nums[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(" Element iS: "+sc.findKthLargest(nums, k));
    }
}