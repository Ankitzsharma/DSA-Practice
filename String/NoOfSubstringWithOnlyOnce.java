package String;

public class NoOfSubstringWithOnlyOnce {

    public static int numSub(String s){
        long count=0;
        int mod=1000000007;
        long ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
            else{
                long add=(count*(count+1))/2;
                add=add%mod;
                ans=(ans+add)%mod;
                count=0;
            }
        }
        long add=(count*(count+1))/2;
        add=add%mod;
        ans=(ans+add)%mod;
        return (int)ans;
    }
    public static void main(String[] args){
        String s="0110111";
        int result= numSub(s);
        System.out.println("no. Of Substring With Only Once: "+result);

    }
}
