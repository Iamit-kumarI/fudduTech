package Leetcode.Math.GCD;

public class WaterAndJusgProblem {
    public static void main(String[] args) {
        System.out.println(canMeasureWater(3,5,4));
    }
    public static boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y)return false;
        if(x==target||y==target||x+y==target)return true;
        return target%gcd(x,y)==0;
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
