package Leetcode.Biweekly.BW172;

public class Q4 {
    public long lastInteger(long n) {
        long start=1,step=1;
        boolean left=true;
        while(n>1){
            if(left||(n&1)==1)start+=step;
            n>>=1;
            step<<=1;
            left=!left;
        }
        return start;
    }
}
