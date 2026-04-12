package Leetcode.Weekly.Weekly477;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        int[]arr={3,1,3,2,0};
        System.out.println(helper(arr));
    }
    public static int maxBalancedSubarray(int[] nums) {
        int ansLen=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(xor(nums,i,j)){
                    if(checkPaulation(nums,i,j)){
                        ansLen=Math.max(ansLen,j-i+1);
                    }
                }
            }
        }
        return ansLen;
    }
    public static boolean xor(int []arr,int start,int end){
        int x=0;
        for(int i=start;i<=end;i++){
            x^=arr[i];
        }
        return x==0;
    }
    public static boolean checkPaulation(int []arr,int start,int end){
        int even=0,odd=0;
        for(int i=start;i<=end;i++){
            if(arr[i]%2==0)even++;
            else odd++;
        }
        return even==odd;
    }
    public static int helper(int []nums){
        Map<String,Integer> map=new HashMap<>();
        int xor=0,n=0,max=0;
        map.put("0#0",-1);
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(nums[i]%2==0)n++;
            else n--;
            String k=xor+"#"+n;
            if(map.containsKey(k)){
                max=Math.max(max,i-map.get(k));
            }else map.put(k,i);
        }
        return max;
    }
}
