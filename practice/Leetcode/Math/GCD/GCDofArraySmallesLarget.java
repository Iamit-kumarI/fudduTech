package Leetcode.Math.GCD;

public class GCDofArraySmallesLarget {
    public static void main(String[] args) {
        int[]arr={2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int[] nums) {
        int smallest=Integer.MAX_VALUE,biggest=Integer.MIN_VALUE;
        for(int val:nums){
            if(val<smallest)smallest=val;
            if(val>biggest)biggest=val;
        }
        return gcd(smallest,biggest);
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
