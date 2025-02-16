package Array;
import java.util.*;
public class LinearSearch {

    static int linearSearch(int arr[] ,int key){
       for(int i=0;i<arr.length; i++){
        if(arr[i]==key){
            return i;
        }
       }
        return -1;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.Of Elements In Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //Intput Array...
        System.out.print("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Key: ");
        int key=sc.nextInt();
        
        // int arr[]={12,89,65,75,25};
        // int key=65;
        int Answer=linearSearch(arr,key);
        if(Answer==-1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key Found At Index: "+Answer);
        }
        sc.close();
    }
}
