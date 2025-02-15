package Array;

public class ReverseArr {
    public static void reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        int ar[]={2,4,6,7,9};
        reverse(ar);
    }
}
