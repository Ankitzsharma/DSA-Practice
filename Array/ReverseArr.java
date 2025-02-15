package Array;
// Reverse Array Without Creating Another Arrays.
public class ReverseArr {

    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
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
