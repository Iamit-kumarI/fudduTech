package DP.Optimise;
import java.util.Arrays;

public class FalingPath {
    public static void main(String[] args) {
        int [][]matrix={
                {2,1,3},
                {6,5,4},
                {7,8,9}
        };
        System.out.println(minFallingPathSum(matrix));
    }
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] dp = Arrays.copyOf(matrix[n - 1], m);
        for (int row = n - 2; row >= 0; row--) {
            int[] arr = new int[m];
            for (int col = 0; col < m; col++) {
                int down = dp[col];
                int leftdown = (col > 0) ? dp[col - 1] : Integer.MAX_VALUE;
                int rightdown = (col < m - 1) ? dp[col + 1] : Integer.MAX_VALUE;
                arr[col] = matrix[row][col] + Math.min(down, Math.min(leftdown, rightdown));
            }
            dp = arr;
        }
        int min = Integer.MAX_VALUE;
        for (int val : dp) {
            min = Math.min(min, val);
        }
        return min;
    }
}
