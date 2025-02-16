package Array;

public class PairOfArr {
    public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+arr[i]+" , "+arr[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int ar[]={2,3,4,5,6};
        subarray(ar);

    }
}
