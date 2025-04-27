package Array;

public class PairOfArr {
    public static void printPair(int arr[]){
        int totalPair=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+arr[i]+" , "+arr[j]+" )");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total No. Of Pairs: "+totalPair);  // N(N-1)/2
    }
    public static void main(String[] args){
        int ar[]={2,3,4,5,6};
        printPair(ar);
    }
}
