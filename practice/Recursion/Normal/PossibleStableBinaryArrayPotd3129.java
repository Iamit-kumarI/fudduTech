package Recursion.Normal;

public class PossibleStableBinaryArrayPotd3129 {
    static final int mod=(int)1e9+7;
    public static void main(String[] args) {
        System.out.println(numberOfStableArrays(3,3,2));
    }
    public static int numberOfStableArrays(int zero, int one, int limit) {
        int[][][]arr=new int[201][201][2];
        for(int i=0;i<201;i++){
            for(int j=0;j<201;j++){
                arr[i][j][0]=-1;
                arr[i][j][1]=-1;
            }
        }
        int zeroCase=helper(zero,one,0,limit,arr)%mod;
        int oneCase=helper(zero,one,1,limit,arr)%mod;
        return (zeroCase+oneCase)%mod;
    }
    public static int helper(int zeroLeft,int oneLeft,int lastWasOne,int limit,int[][][]dp){
        if(oneLeft==0&&zeroLeft==0)return 1;
        if(dp[oneLeft][zeroLeft][lastWasOne]!=-1)return dp[oneLeft][zeroLeft][lastWasOne];
        long ans=0;
        if(lastWasOne==1){
            //explore 0
            for(int i=1;i<=limit&&zeroLeft-i>=0;i++){
                ans =(ans+helper(zeroLeft-i,oneLeft,0,limit,dp))%mod;
            }
        }else{
            for(int i=1;i<=limit&&oneLeft-i>=0;i++){
                ans=(ans+helper(zeroLeft,oneLeft-i,1,limit,dp))%mod;
            }
        }
        return dp[oneLeft][zeroLeft][lastWasOne]=(int)ans;
    }
}
