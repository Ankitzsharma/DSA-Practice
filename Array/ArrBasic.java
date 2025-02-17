package Array;
import java.util.Scanner;
class ArrBasic{
    public static void main(String []args){
        int arr1[]={2,3,4,5};      // Declaration And Initialization
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println("I'm In again");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];  // Declaration And Initialization
        // input array...
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        // output Array...
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();

    }
} 