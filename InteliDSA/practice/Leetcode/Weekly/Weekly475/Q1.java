package Leetcode.Weekly.Weekly475;

public class Q1 {
    public static void main(String[] args) {
        int []arr={1,2,1,1,3};
        System.out.println(minimumDistance(arr));
    }
    public static int minimumDistance(int[] nums) {
        int dis=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]==nums[j])&&(nums[j]==nums[k])){
                        dis=Math.min(Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i),dis);
                    }
                }
            }
        }
        return dis==Integer.MAX_VALUE?-1:dis;
    }
}
