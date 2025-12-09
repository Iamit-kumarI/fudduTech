package Leetcode;

public class TDay44 {
    public static void main(String[] args) {
        System.out.println(addDigits(19));
    }
    public static int addDigits(int num) {
        int sum=helper(num,0);
        while(sum>=10){
            sum=helper(sum,0);
        }
        return sum;
    }
    public static int helper(int num,int val){
        if(num<=0)return val;
        return helper(num/10,val+=num%10);
    }
}
