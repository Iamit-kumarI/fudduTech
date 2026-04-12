package Leetcode.Matrix;

public class TDay50Ltc59 {
    public int[][] generateMatrix(int n) {
        int[][]arr=new int[n][n];
        int top=0,left=0,bottom=n-1,right=n-1,val=1;
        while(top<=bottom&&left<=right){
            for(int j=left;j<=right;j++){
                arr[top][j]=val++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=val++;
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    arr[bottom][j]=val++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=val++;
                }
                left++;
            }
        }
        return arr;
    }
}
