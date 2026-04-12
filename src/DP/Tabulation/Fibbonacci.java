package DP.Tabulation;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    public static int fibo(int n){
        int prev2=0,prev1=1;
        int current=0;
        for(int i=2;i<=n;i++){
            current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
}
//tc O(n)
//sc O(1)
