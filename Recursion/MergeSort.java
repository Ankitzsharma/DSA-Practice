package Recursion;

public class MergeSort {
    
    public static void mergeSort(int arr[],int si,int ei){
        //base Case
        if(si>=ei){
            return; // Base case: if the subarray has one or no elements, it's already sorted

        }

        //Kaam
        int  mid=si+(ei-si)/2; // Find the middle index

        mergeSort(arr,si,mid); // Recursively sort the left half

        mergeSort(arr,mid+1,ei); // Recursively sort the right half
        
        merge(arr,si,mid,ei); // Merge the two sorted halves
    }


    //merge function to combine two sorted subarrays
    public static void merge(int arr[],int si,int mid, int ei){
        
        int temp[]=new int[ei-si+1]; // Temporary array to hold merged elements

        int i=si; // Pointer for the left subarray's start
        int j=mid+1; // Pointer for the right subarray's start
        int k=0; // Pointer for the temporary array

        // Merging the two subarrays
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++; 
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from the left subarray, if any
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // Copy remaining elements from the right subarray, if any
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // Copy the merged elements back to the original array
        for(k=0, i=si; k<temp.length;k++, i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr,0,arr.length-1);
        System.out.print("Sorted Array: ");
        for(int elem: arr){
            System.out.print(elem+" ");
        }
    }
}
