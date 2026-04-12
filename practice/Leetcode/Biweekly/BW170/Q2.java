package Leetcode.Biweekly.BW170;

public class Q2 {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=solve(i);
        }
        return ans;
    }
    public int solve(int n){
        String s=String.valueOf(n);
        if(s.length()<3)return 0;
        int ans=0;
        int len=s.length();
        for(int i=1;i<len-1;i++){
            int prev= s.charAt(i-1)-'0';
            int curr=s.charAt(i)-'0';
            int next=s.charAt(i+1)-'0';
            if(curr<prev&&curr<next)ans++;
            if(curr>prev&&curr>next)ans++;
        }
        return ans;
    }
}
