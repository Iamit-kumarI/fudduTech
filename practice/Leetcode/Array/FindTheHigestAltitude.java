package Leetcode.Array;

import java.util.Arrays;

public class FindTheHigestAltitude {
    public static void main(String[] args) {
        int[]arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int n=gain.length,index=0,max=0;
        int[]arr=new int[n+1];
        arr[index++]=0;
        for(int val:gain){
            arr[index]=arr[index-1]+val;
            if(arr[index]>max){
                max=arr[index];
            }
            index++;
        }
        return max;
    }
}
