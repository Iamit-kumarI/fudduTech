package Leetcode.Matrix;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class ConstructProductOfMatrix {
    public static void main(String[] args) {
        int[][]arr={
                {1,2},
                {3,4}
        };
        arr=constructProductMatrix(arr);
        for(int[]row:arr) System.out.println(Arrays.toString(row));
    }
    public static int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length,m= grid[0].length;
        BigInteger mul=BigInteger.ONE;
        for(int[]val:grid){
            for(int i=0;i<val.length;i++){
                mul=mul.multiply(BigInteger.valueOf(val[i]));
            }
        }
        BigInteger mod=BigInteger.valueOf(12345);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=mul.divide(BigInteger.valueOf(grid[i][j])).mod(mod).intValue();
            }
        }
        return grid;
    }
}
