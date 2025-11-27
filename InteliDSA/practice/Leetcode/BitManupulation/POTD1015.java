package Leetcode.BitManupulation;

public class POTD1015 {
    public static void main(String[] args) {
        System.out.println(smallestRepunitDivByK(3));
    }
    public static int smallestRepunitDivByK(int k) {
        if(k%2==0)return -1;
        int cur=0;
        for(int i=1;i<=k;i++){
            cur=(cur*10+1)%k;
            if(cur==0)return i;
        }
        return -1;
    }
}
