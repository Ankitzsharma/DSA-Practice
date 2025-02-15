package Array;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){  //right
                start=mid+1;
            }
            else{  //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No. Of Elements In Araay: ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<ar.length;i++){
            ar[i]=s.nextInt();
        }
        System.out.print("Input Array: ");
        for(int elem:ar){
            System.out.print(elem+" ");
        }
        System.out.print("Enter Key: ");
        int key=s.nextInt(); 
        System.out.println("Index for Key Is: "+binarySearch(ar, key));

    }
}
