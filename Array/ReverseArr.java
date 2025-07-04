package Array;
// Reverse Array Without Creating Another Arrays.
public class ReverseArr {

    public static void reverse(int arr[]){
        // int start=0,end=arr.length-1;               //t.c= O(n)
        // while(start<end){                           //s.c= 1
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }

        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void main(String []args){
        int arr[]={2,4,6,7,9,8};
        System.out.println("Array Before Reverse");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        reverse(arr);  //Function Calling....

        System.out.println("\nArray After Reverse");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
