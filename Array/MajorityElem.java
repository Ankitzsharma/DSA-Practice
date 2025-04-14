package Array;

public class MajorityElem {

    public static int solution(int nums[]){
        // int min=Integer.MIN_VALUE;
        int lead=0;
        int majorElem=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    lead++;
                    majorElem=nums[i];
                }else{
                    lead--;
                    if(lead<0){
                        lead=0;
                    }
                }
            }
        }
        if(lead>=nums.length/2){
            lead=majorElem;
        }
        return majorElem;
    }
    public static void main(String[] args){
        int nums[]={2,3,4,4};
        System.out.println("Majority Element Is: "+solution(nums));
    }
}
