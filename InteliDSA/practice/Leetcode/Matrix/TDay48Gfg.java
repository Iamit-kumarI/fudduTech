package Leetcode.Matrix;

import java.util.Arrays;

public class TDay48Gfg {
    public int median(int[][] mat) {
        int[]arr=new int[mat.length*mat[0].length];
        int index=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[index++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}
