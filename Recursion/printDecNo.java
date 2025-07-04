package Recursion;
import java.util.*;
class printDecNo{

    public static void printNo(int n){
        if(n==1){  // Base COndition
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNo(n-1);    // Recursion

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. From Which You Want to Start Printing Decreasing No.: ");
        int n=s.nextInt();
        printNo(n);    //Function Calling..

        s.close();
    }
}