package Leetcode.Matrix;

public class TDay52 {
    public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        int  n=rowSum.length,m=colSum.length;
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cur=Math.min(rowSum[i],colSum[j]);
                arr[i][j]=cur;
                rowSum[i]-=cur;
                colSum[j]-=cur;
            }
        }
        return arr;
    }
}
