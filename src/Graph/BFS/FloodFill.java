package Graph.BFS;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][]arr={
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        System.out.println(Arrays.toString(floodFill(arr,1,1,2)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
//        int[][]visited=new int[image.length][image[0].length];
        int[][]arr=Arrays.copyOf(image,image.length);
        int iniColour=arr[sr][sc];
        int[]goRow={-1,0,1,0};
        int[]goCol={0,1,0,-1};
        helperDFS(image,sr,sc,iniColour,color,goRow,goCol,arr);
        return arr;
    }
    public static void helperDFS(int[][]images,int row,int col,int iniColor,int newColor,int[]goRow,int[] goCol,int[][]arr){
        arr[row][col]=newColor;
        int n=arr.length,m=arr[0].length;
        for(int i=0;i<4;i++){
            int newRow=row+goRow[i];
            int newCol=col+goCol[i];
            //we don't need visited we will just check if its color match to the newColor means its
            //visited already other wise not visited
            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&arr[newRow][newCol]!=newColor&&
                    images[newRow][newCol]==iniColor){
                helperDFS(images,newRow,newCol,iniColor,newColor,goRow,goCol,arr);
            }
        }
    }
}
