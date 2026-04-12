package Leetcode.Matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FlipSquareSubMatrixLtc3643 {
    public static void main(String[] args) {
        int[][]arr={
                {3,4,2,3},
                {2,3,4,2}
        };
        arr=reverseSubmatrix(arr,0,2,2);
        for(int[]row:arr) System.out.println(Arrays.toString(row));
    }
    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=x;i<k;i++){
            for(int j=y;j<y+k;j++){
                if(i+k-1<grid.length&&j+k-1<grid[0].length){
                    //swap
                    int temp=grid[i][j];
                    grid[i][j]=grid[i+k-1][j+k-1];
                    grid[i+k-1][j+k-1]=temp;
                }
            }
        }
        return grid;
    }
}
