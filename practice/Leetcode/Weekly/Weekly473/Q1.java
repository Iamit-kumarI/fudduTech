package Leetcode.Weekly.Weekly473;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(removeZeros(1020090));
    }
    public static long removeZeros(long n) {
        StringBuilder val=new StringBuilder();
        while(n>0){
            if((n%10)==0){
                n/=10;
                continue;
            }
            val.append(n%10);
            n/=10;
        }
        if(val.length()==0)return 0;
        return Long.parseLong(val.reverse().toString());
    }
}
