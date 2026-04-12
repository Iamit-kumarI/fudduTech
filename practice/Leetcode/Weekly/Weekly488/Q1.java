package Leetcode.Weekly.Weekly488;

public class Q1 {
    public static void main(String[] args) {
        int[]arr={5,4,3};
        System.out.println(dominantIndices(arr));
    }
    public static int dominantIndices(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> avgCheck(i+1,nums))ans++;
        }
        return ans;
    }
    public static int avgCheck(int index, int[]arr){
        if(index==arr.length)return Integer.MAX_VALUE;
        int curtotal=0;
        for(int j=index;j<arr.length;j++)curtotal+=arr[j];
        return curtotal/(arr.length-index);
    }
}
