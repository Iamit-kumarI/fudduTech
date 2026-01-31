package Leetcode.Biweekly.BW175;

public class Q2 {
    public static void main(String[] args) {
        int[]arr={3,7,5};
        System.out.println(minimumK(arr));
    }
    public static int minimumK(int[] nums) {
        int n=nums.length,maximum=0;
        int start=1;
        for(int val:nums)if(val>maximum)maximum=val;
        int end=Math.max(n,maximum);
        int ans=end;
        while (start<=end){
            int mid=start+(end-start)/2;
            long count=0;
            for(int val:nums){
                count+=(val+mid-1)/mid;
            }
            if(count<=(long)mid*mid){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
