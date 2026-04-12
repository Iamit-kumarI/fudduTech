package Leetcode.Weekly.Weekly487;

public class Q2 {
    public static void main(String[] args) {
        int[]arr={3,7};
        System.out.println(finalElement(arr));
    }
    public static int finalElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int val:nums)if(val>max)max=val;
        int[][]arr=new int[nums.length][max];
        return alicePlaying(nums,0,arr.length-1,arr);
    }
    public static int alicePlaying(int[]arr, int l, int r, int[][]dp){
        if(r<0|| l==arr.length)return -1;
        if(r-l<=1)return arr[r-l];
        int playing=0;
        if(r-l+1<(arr.length-r-l)){
            playing= bobPlaying(arr,l,r-1,dp);
        }
        int notPlaying=alicePlaying(arr,l+1,r-1,dp);
        return dp[l][r]=playing+notPlaying;
    }
    public static int bobPlaying(int[]arr, int l, int r, int[][]dp){
        if(r<0||l==arr.length)return -1;
        if(l-r<=1)return arr[l-r];
        int playing=0;
        if(r-l+1<(arr.length-r-l)){
            playing= bobPlaying(arr,l,r-1,dp);
        }
        int notPlaying=alicePlaying(arr,l+1,r-1,dp);
        return dp[l][r]=playing+notPlaying;
    }
}
