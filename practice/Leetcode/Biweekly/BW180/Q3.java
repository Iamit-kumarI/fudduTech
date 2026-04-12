package Leetcode.Biweekly.BW180;

public class Q3 {
    public int minOperations(int[] nums) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            int val=nums[i];
            if(i%2==0){
                int next=val;
                while(!isPrime(next))next++;
                count+=(next-val);
            }else{
                int next=val;
                while(isPrime(next))next++;
                count+=(next-val);
            }
        }
        return count;
    }
    public static boolean isPrime(int val){
        if(val<=1)return false;
        if(val==2)return true;
        if(val%2==0)return false;
        for(int i=3;i*i<=val;i+=2){
            if(val%i==0)return false;
        }
        return true;
    }
}
