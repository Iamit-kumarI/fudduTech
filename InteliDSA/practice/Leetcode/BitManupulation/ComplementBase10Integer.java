package Leetcode.BitManupulation;

public class ComplementBase10Integer {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
    public static int bitwiseComplement(int n) {
        int ans=0,track=1;
        while(n>0){
            int curBit=n&1;
            if(curBit==1){
                ans+=track;
            }
            track<<=1;
            n>>=1;
        }
        return ans;
    }
}
