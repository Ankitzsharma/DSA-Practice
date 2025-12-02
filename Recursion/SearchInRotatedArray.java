package Recursion;


//  Search in Roatated Array
//  Input : Sorted, Rotated array with Distinct number(in ascending order)
//          It is rotated at a pivot point.find the index of given element.
//          arr : [4,5,6,7,0,1,2]  target: 0   output: 4 

public class SearchInRotatedArray {

    public static int search(int arr[], int tar, int si, int ei){
        
        //base case
        if(si > ei){
            return -1;
        }


        // kaam
        int mid = si + (ei - si) / 2;

        // case Found
        if(arr[mid]==tar) return mid;

        //case: Mid on L1
        if(arr[si] <= arr[mid]){
            //case a: search left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                //case b: search right
                return search(arr, tar, mid+1, ei);
            }
        }


        //case 2: Mid on L2
        else{
            //case c: search L2 right
            if(arr[mid] <=tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                //case d: search L2 left
                return search(arr, tar, si, mid-1);
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target =0;   //output -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println("Targeted Element from Rotated Array is: "+tarIdx);
    }
}
