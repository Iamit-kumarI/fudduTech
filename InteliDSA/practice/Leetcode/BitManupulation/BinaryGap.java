package Leetcode.BitManupulation;

import java.util.Stack;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(8));
    }
    public static int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int count=0,max=0;//will finx this soon
        boolean onefound=false;
        for(char c:s.toCharArray()){
            if(c=='0'&&onefound){
                count++;
                continue;
            }else if(c=='1'){
                if(onefound)count=1;
                onefound=true;

            }
            max=Math.max(max,count);
        }
        return max==0?0:max+1;
    }
}
