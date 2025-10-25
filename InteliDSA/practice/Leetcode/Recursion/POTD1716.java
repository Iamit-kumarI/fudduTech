package Leetcode.Recursion;

public class POTD1716 {
    public static void main(String[] args) {
        System.out.println(totalMoney(10));
    }
    public static int totalMoney(int n) {
        return sum(n,1,1);
    }
    public static int sum(int n,int currentDayValue,int start){
        if(n==0)return 0;
        int today=start+(currentDayValue-1);
        if(currentDayValue==7)return today+sum(n-1,1,start+1);
        return today+sum(n-1,currentDayValue+1,start);

    }
}
