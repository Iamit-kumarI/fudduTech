package Leetcode.BitManupulation;

public class BinaryNoWithAlterNateBits {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
    public static boolean hasAlternatingBits(int n) {
        int lastbit= (n&1)==0?1:0;
        while (n>0){
            int cur=n&1;
            if(cur==lastbit)return false;
            lastbit=cur;
            n=n>>1;
        }
        return true;
    }
}
