package Array;
public class sort_color {


    public static void sortColor(int nums[]){
        int n=nums.length, count=0, count1=0, count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) count++;
            else if(nums[i]==1) count1++;
            else count2++;
        }
        int idx=0;
        for(int i=0; i<count;i++){
            nums[idx++]=0;
        }
        for(int i=0;i<count1;i++){
            nums[idx++]=1;
        }
        for(int i=0;i<count2;i++){
            nums[idx++]=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0,2,0,2,1,1,0};
        sortColor(nums);
    }
}
