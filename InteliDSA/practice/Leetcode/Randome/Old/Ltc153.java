package Leetcode.Randome.Old;

public class Ltc153 {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        return helper(nums,Integer.MAX_VALUE,0,nums.length-1);
    }
    public static int helper(int[]arr,int min,int s, int e){
        if(s>e){
            return min;
        }
        if(arr[s]==arr[e]){
            min=Math.min(min,arr[s]);
            return helper(arr,min,s+1,e-1);
        }
        if (arr[s] <= arr[e]) {
            return Math.min(min, arr[s]);
        }

        int m=s+(e-s)/2;
        min=Math.min(min,arr[m]);
        if(arr[m]>=arr[s]){
            return helper(arr,min,m+1,e);
        }else{
            return helper(arr,min,s,m-1);
        }
    }
}
