package TwoPointerSlidingWIndow;

public class MaximumConsitutiveOneIII {
    public static void main(String[] args) {
        int[]arr={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr,2));
    }
    public static int longestOnes(int[] nums, int k) {
        int one=0,zero=0,max=0;
        for(int val:nums){
            if(val==1)one++;
            else zero++;
            if(zero==k&&one!=0)one+=2;
            if(zero>k)one=0;
            max=Math.max(one,max);
        }
        return max;
    }
}
