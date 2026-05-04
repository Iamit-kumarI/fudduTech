package Leetcode.Matrix;

import java.util.Arrays;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(arr);
    }
    public static void rotate(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int[]row:matrix){
            int left=0,right=row.length-1;
            while(left<right){
                int temp=row[left];
                row[left++]=row[right];
                row[right--]=temp;
            }
        }
        for(int[]row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
