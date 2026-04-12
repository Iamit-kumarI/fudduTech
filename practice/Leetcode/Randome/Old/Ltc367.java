package Leetcode.Randome.Old;

public class Ltc367 {
    public static void main(String[] args) {
        System.out.println(isPerfectsquare(16));
    }
    public static boolean isPerfectsquare(int num){
        if(num<2) return true;
        return helper(num,0);
    }
    public static boolean helper(int num,int i){
        if(i>num/2) return false;
        if(i*i==num) return true;
        return helper(num,i+1);
    }
}