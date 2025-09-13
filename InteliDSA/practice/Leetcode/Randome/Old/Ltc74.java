package Leetcode.Randome.Old;

//search in 2d matrix
public class Ltc74 {
    public static void main(String[] args) {
        int [][]matrix={
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,60}
                {1,3}
        };
        System.out.println(searchMatrix(matrix, 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target){
        return helper(matrix,target);
    }
    public static boolean helper(int[][]matrix,int target){
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                return binarySearch(matrix[i], target, 0, matrix[i].length - 1);
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] arr,int target,int s,int e){
        if(s>e){
            return false;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return true;
        }
        if(arr[mid]>target){
            return binarySearch(arr,target,s,mid-1);
        }
        return binarySearch(arr,target,mid+1,e);
    }
}
