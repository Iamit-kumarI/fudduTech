package Leetcode.Matrix;

public class TDay54 {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        int n=matrixA.length,m=matrixA.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixA[i][j]+=matrixB[i][j];
            }
        }
    }
}
