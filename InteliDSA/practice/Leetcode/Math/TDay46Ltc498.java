package Leetcode.Math;

public class TDay46Ltc498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[]arr=new int[m*n];
        int i=0,j=0,index=0;
        boolean rev=true;
        while(index<arr.length){
            arr[index++]=mat[i][j];
            if(rev){
                if(j==m-1){
                    i++;
                    rev=false;
                }else if(i==0){
                    j++;
                    rev=false;
                }else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==n-1){
                    j++;
                    rev=true;
                }else if(j==0){
                    i++;
                    rev=true;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return arr;
    }
}
