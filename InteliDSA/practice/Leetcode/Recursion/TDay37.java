package Leetcode.Recursion;

public class TDay37 {
    public static void main(String[] args) {
        int n=20;
        System.out.println(helper(n,0,n));
    }
    public static int helper(int n,int count,int div){
        if(div==0)return count;
        int rem=div%10;
        if(!(rem==0)&&n%rem==0)count++;
        return helper(n,count,div/10);
    }
}