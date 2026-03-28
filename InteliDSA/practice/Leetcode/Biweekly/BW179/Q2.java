package Leetcode.Biweekly.BW179;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(countVisiblePeople(3,1,0));
    }
    public static int countVisiblePeople(int n, int pos, int k) {
        long mod=1000000007L;
        int left=pos;
        int right=n-1-pos;
        long[]fact=new long[n+1];
        long[]revFact=new long[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=fact[i-1]*i%mod;
        }
        revFact[n]=pop(fact[n],mod-2,mod);
        for(int i=n-1;i>=0;i--){
            revFact[i]=revFact[i+1]*(i+1)%mod;
        }
        long ans=0;
        for(int j=0;j<=k;j++){
            int newleft=j;
            int newright=k-j;
            if(newleft>left||newright>right)continue;
            long posibility=combind(left,newleft,fact,revFact,mod)*combind(right,newright,fact,revFact,mod)%mod;
            ans=(ans+posibility)%mod;
        }
        ans=ans*2%mod;
        return (int)ans;
    }
    public static long combind(int n, int r, long[]fact, long[] revfact, long mod){
        if(r<0||r>n)return 0;
        return fact[n]*revfact[r]%mod*revfact[n-r]%mod;
    }
    public static long pop(long b, long e, long mod){
        long ans=1;
        b%=mod;
        while(e>0){
            if((e&1)==1){
                ans=ans*b%mod;
            }
            b=b*b%mod;
            e>>=1;
        }
        return ans;
    }
}
