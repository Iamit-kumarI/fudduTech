package Leetcode.Weekly.Weekly487;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(countMonobit(1));
    }
    public static int countMonobit(int n) {
        int ans=1;
        int num=1;
        while(num<=n){
            num=(num<<1)|1;
            ans++;
        }
        return ans;
    }
}
