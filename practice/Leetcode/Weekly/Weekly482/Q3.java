package Leetcode.Weekly.Weekly482;

public class Q3 {
    public int minAllOneMultiple(int k) {
        if(k%2==0||k%5==0)return -1;
        int remender=0;
        for(int len=0;len<=k;len++){
            remender=(remender*10+1)%k;
            if(remender==0)return len;
        }
        return -1;
    }
}
