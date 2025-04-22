package Functions;
import java.util.*;
public class CountNumberOfFairPairs {
    public static int countFairPairs(int nums[],int lower, int upper){
        int count=0;
        Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i]+" ");
        // }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(((nums[i]+nums[j])>=lower) && ((nums[i]+nums[j])<=upper)){
                    System.out.println("("+nums[i]+","+nums[j]+")");
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,7,9,2,5};
        int lower=11, upper=11;
        System.out.println("Pairs Are: "+countFairPairs(nums,lower,upper));
    }
}
