package Array;

public class PrintSubarray {
    /**
     * @param arr
     */
    public static void subArr(int arr[]){
    //     int totalSubArr=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){        //Start
    //         for(int j=i;j<arr.length;j++){    //End
    //             System.out.print(" [");
    //             int currSum=0;
    //             for(int k=i;k<=j;k++){     // Start --> End
    //                 System.out.print(" "+arr[k]+" ");
    //                 currSum+=arr[k];
    //             }
    //             System.out.println("]= "+currSum);
    //             totalSubArr++;
    //             if(maxSum<currSum){
    //                 maxSum=currSum;
    //             }

    //         }
    //         System.out.println();
    //     }
    //     System.out.println("MaxSum: "+maxSum);
    //     System.out.println("Total Subarray Are: "+totalSubArr); // Sum Of N Numbers(Having Total No. Of Subarray) = N(N+1)/2
    // }



    // public static void subArr(int ar[]){
    //     for(int i=0;i<ar.length;i++){
    //         for(int j=i;j<ar.length;j++){

    //             for(int k=i;k<=j;k++){
    //                 System.out.print(ar[k]);
    //             }
    //             System.out.print(", ");
    //         }
    //         System.out.println();
    //     }
    // }




    int maxSum=0;
    for(int i=0;i<arr.length;i++){
        for (int j = i; j < arr.length; j++) {
            System.out.print("( ");
            int sum=0;
            for (int j2 = i; j2 <= j; j2++) {
                System.out.print(arr[j2]+",");
                sum+=arr[j2];
            }
            System.out.println(" )= "+sum);
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.println();
    }
    System.out.println("MaxSum Is: "+maxSum);
}
    public static void main(String[] args){
        int ar[]={2,3,4,5,6};
        subArr(ar);
    }
}
