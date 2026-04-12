package Leetcode.Biweekly.BW180;

public class Q2 {
    public static void main(String[] args) {
        int[]arr={12,54,32,22};
        System.out.println(countDigitOccurrences(arr,2));
    }
    public static int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int val:nums){
            count+=helper(val,digit);
        }
        return count;
    }
    public static int helper(int val,int digit){
        int count=0;
        while(val>0){
            int rem=val%10;
            if(rem==digit)count++;
            val/=10;
        }
        return count;
    }
}
