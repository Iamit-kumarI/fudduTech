package Leetcode.Matrix;

public class TDay53RotateMatrixClockWise {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
       int r1=0,c1=0;
       int r2=M-1,c2=N-1;
        while(r1<r2&&c1<c2){
            int temp=Mat[r1][c1];
            for(int i=r1;i<r2;i++)Mat[i][c1]=Mat[i+1][c1];
            for(int i=c1;i<c2;i++)Mat[r2][i]=Mat[r2][i+1];
            for(int i=r2;i>r1;i--)Mat[i][c2]=Mat[i-1][c2];
            for(int i=c2;i>c1+1;i--)Mat[r1][i]=Mat[r1][i-1];
            Mat[r1][c1+1]=temp;
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return Mat;
    }
}
