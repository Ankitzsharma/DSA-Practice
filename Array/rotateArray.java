package Array;
class rotateArray{

    public static void rotate(int nums[], int k){
        int n=nums.length;
        k=k%n;   //if k>n

            // Reverse the whole array
        reverse(nums,0,n-1);

           // Reverse first k elements
        reverse(nums,0,k-1);

        // Reverse the remaining elements

        reverse(nums, k, n-1);
    }

    public static void reverse(int nums[], int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        rotateArray RA=new rotateArray();
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        RA.rotate(nums,k);

        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}