package Leetcode.Matrix;

import java.util.Arrays;

public class RotatingTheBox {
    public static void main(String[] args) {
        char[][]arr={
                {'#','.','*','.'},
                {'#','.','#','*'}
        };
        arr=rotateTheBox(arr);
        for(char[]row:arr){
            System.out.println(Arrays.toString(row));
        }
    }
    public static char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length,m=boxGrid[0].length,index=0;
        char[][]arr=new char[m][n];

        for(char[]row:boxGrid){
            int leftSafePos=-1;
            boolean lastWasObstical=false;
            for(int i=0;i<row.length;i++){
                if(row[i]=='*'){
                    lastWasObstical=true;
                    leftSafePos=-1;
                }else if(row[i]=='#'){
                    if(leftSafePos!=-1){
                        row[leftSafePos++]='#';
                        row[i]='.';
                    }
                }
            }
            for(int i=0;i<n;i++){
                arr[index][i]=row[i];
            }
            index++;
        }
        return arr;
    }
}
