package Array;
import java.util.*;
public class LargestNumber {
    public static int largest(int arr[]){
        int min=Integer.MIN_VALUE; //  -Infinity.
        int max=Integer.MAX_VALUE; //  +Infinity.
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.print("\nMinimum Elemenets Is: "+max);
        return (min);
    }
    public static void main(String []args){
        int arr[]={2,4,6,8,9,199};
        System.out.print("Input Array Is: ");
        //array printing...
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //Function Calling...
        int result=largest(arr);
        System.out.println("\nMaximum Elements is: "+result);
    }
}
