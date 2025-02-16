package Array;

public class PrintSubarray {
    public static void subArr(int arr[]){
        int totalSubArr=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print(" [");
                int currSum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k]+" ");
                    currSum+=arr[k];
                }
                System.out.println("]= "+currSum);
                totalSubArr++;
                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }
            System.out.println();
        }
        System.out.println("MaxSum: "+maxSum);
        System.out.println("Total Subarray Are: "+totalSubArr); // Sum Of N Numbers(Having Total No. Of Subarray) = N(N+1)/2
    }
    public static void main(String[] args){
        int ar[]={2,3,4,5,6};
        subArr(ar);
    }
}
