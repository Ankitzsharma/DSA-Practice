package Array;
import java.util.*;
public class MaxSubarraySum {
    public static void printArr(int arr[]){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){    //Start
            for(int j=i;j<arr.length;j++){   //End
                int currSum=0;
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                    currSum+=arr[k];
                    if(min<currSum){
                        min=currSum;
                    }
                }
                System.out.println("="+currSum);
                System.out.println();
            }
        }
        System.out.println("Maximum Sum Is: "+min);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        
        // System.out.print("Enter No. Of Element In an Array: ");
        // int n=s.nextInt();
        // int ar[]=new int[n];
        // for (int i = 0; i < ar.length; i++) {
        //     ar[i]=s.nextInt();
        // }
        printArr(arr);
        s.close();

    }
}
