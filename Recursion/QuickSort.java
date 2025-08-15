package Recursion;

public class QuickSort {
    public static void main(String[] args){
        int arr[]={3,6,8,10,1,2,1};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr); // Output: 1 1 2 3 6 8 10
    }
    public static void quickSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //last Element as pivot
        int pIdx= partition(arr, si, ei);
        quickSort(arr,si, pIdx-1);  //left part
        quickSort(arr, pIdx+1, ei);  //right part
    }

    public static int partition(int arr[], int si, int ei){
        int pivot= arr[ei];
        int i= si-1; //to make place for elements less than pivot

        for(int j=si; j< ei; j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
        //swap pivot to its correct position
        i++;
        int temp= pivot;
        arr[ei]=arr[i];  //not working pivot = arr[i]
        arr[i]=temp;

        return i; //returning pivot index
    }

    public static void printArray(int arr[]){
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
