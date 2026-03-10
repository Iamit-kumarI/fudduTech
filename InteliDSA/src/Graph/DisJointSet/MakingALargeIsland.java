package Graph.DisJointSet;

import java.util.HashSet;
import java.util.Set;

public class MakingALargeIsland {
    public static void main(String[] args) {
        int[][]arr={
                {1,0},
                {0,1}
        };
        System.out.println(largestIsland(arr));
    }
    public static int largestIsland(int[][] grid) {
        int n=grid.length;
        DisJointSetBySize ds=new DisJointSetBySize(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0)continue;
                int[]dr={-1,0,1,0};
                int[]dc={0,-1,0,1};
                for(int index=0;index<4;index++){
                    int newRow=i+dr[index];
                    int newCol=j+dc[index];
                    if(isValid(newRow,newCol,n)&&grid[newRow][newCol]==1){
                        int nodeNo=i*n+j;
                        int adjNodeNo=newRow*n+newCol;
                        ds.unionBySize(nodeNo,adjNodeNo);
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)continue;
//                else {
                    int[]dr={-1,0,1,0};
                    int[]dc={0,-1,0,1};
                    Set<Integer> set=new HashSet<>();
                    for(int index=0;index<4;index++){
                        int newRow=i+dr[index];
                        int newCol=j+dc[index];
                        if(isValid(newRow,newCol,n)){
                            if(grid[newRow][newCol]==1){
                                set.add(ds.findParent(newRow*n+newCol));
                            }
                        }
                    }
                    int sizeTotal=0;
                    for(Integer parent:set){
                        sizeTotal+=ds.size[parent];
                    }
                    max=Math.max(max,sizeTotal+1);
//                }
            }
        }
        for(int cellNo=0;cellNo<n*n;cellNo++){
            max=Math.max(max,ds.size[cellNo]);
        }
        return max;
    }
    public static boolean isValid(int row,int col,int n){
        if(row<n&&col<n&&col>=0&&row>=0)return true;
        return false;
    }
}
