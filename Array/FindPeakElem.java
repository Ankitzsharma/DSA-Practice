package Array;

public class FindPeakElem{

    public static void main(String[] args){
        int num[]={1,2,3,1};
        int peakIndex= findPeakElem(num);
        System.out.println("Peak Element Index: "+peakIndex);
    }

    public static int findPeakElem(int num[]){
        int left=0, right=num.length-1;
        while(left < right){
            int mid= left+(right-left)/2; //midPoint calculation
            if(num[mid]>num[mid+1]){
                right=mid; // Move left if mid is greater than next element
            } else {
                left=mid+1; // Move right if mid is less than or equal to next element
            }
        }

        return left;
    }
}