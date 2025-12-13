package Leetcode.Matrix;

public class TDay48Ltc2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[]max=new int[2];
        int freq=0,lastfreq=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)freq++;
            }
            if(freq>lastfreq){
                max[0]=i;
                max[1]=freq;
                lastfreq=freq;
            }
            freq=0;
        }
        return max;
    }
}
