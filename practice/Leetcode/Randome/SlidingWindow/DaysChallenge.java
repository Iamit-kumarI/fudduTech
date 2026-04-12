package Leetcode.Randome.SlidingWindow;

public class DaysChallenge {
    public static void main(String[] args) {
        int []arr={1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }
    public static int maxFrequencyElements(int[] nums) {
        int max=0;
        for(int val:nums)if(val>max) max=val;
        int []freq=new int[max+1];
        for(int val:nums)freq[val]++;
        int maxfreq=0;
        for(int val:freq)if(val>maxfreq)maxfreq=val;
        int ans=0;
        for(int val:freq)if(maxfreq==val)ans+=val;
        return ans;
    }
}