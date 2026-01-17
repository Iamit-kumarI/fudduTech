package Leetcode.Biweekly.BW174;

public class Q1 {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx=center[0],cy=center[1];
        int max=-1,x1=-1,y1=-1;
        for(int[]row:towers){
            int x=row[0],y=row[1],q=row[2];
            int distance=Math.abs(x-cx)+Math.abs(y-cy);
            if(distance<=radius){
                if(q>max){
                    max=q;
                    x1=x;
                    y1=y;
                }else if(max==q){
                    if(x<x1||(x==x1&&y<y1)){
                        x1=x;
                        y1=y;
                    }
                }
            }
        }
        return max==-1?new int[]{-1,-1}:new int[]{x1,y1};
    }
}
