package Leetcode.BitManupulation;

import java.util.Stack;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(8));
    }
    public static int binaryGap(int n) {
        int max=0,cur=0,index=-1;
        while(n>0){
            if((n&1)==1){
                if(index!=-1)max=Math.max(max,cur-index);
                index=cur;
            }
            cur++;
            n>>=1;
        }
        return max;
    }
}
