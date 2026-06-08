package Leetcode.Math;

public class DigitFreqScore {
    public static void main(String[] args) {
        System.out.println(digitFrequencyScore(122));
    }
    public static int digitFrequencyScore(int n) {
        int[]arr=new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        int ans=0;
        for(int i=0;i<10;i++){
            if(arr[i]!=0)ans+=(i*arr[i]);
        }
        return ans;
    }
}
