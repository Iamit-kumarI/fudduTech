package Leetcode.POTD;

import java.util.PriorityQueue;

public class MaximumBuildingHeight {
    static class Pair{
        int building;
        int heightlimit;
        Pair(int building,int heightlimit){
            this.building=building;
            this.heightlimit=heightlimit;
        }
    }
    public static void main(String[] args) {
        int[][]arr={
                {5,3},
                {2,5},
                {7,4}
        };
        System.out.println(maxBuilding(7,arr));
    }
    public static int maxBuilding(int n, int[][] restrictions) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.building-b.building);
        for(int[]row:restrictions){
            pq.offer(new Pair(row[0],row[1]));
        }
        int max=0,last=0,posi=1;
        while(posi<=n){
            int curBuilding=pq.isEmpty()?Integer.MAX_VALUE:pq.peek().building;
            if(posi<curBuilding){
                last+=1;
                posi++;
            }else if(posi>=curBuilding){
                if(!pq.isEmpty()){
                    last=Math.min(pq.peek().heightlimit,last+1);
                    pq.poll();
                }else last++;
                posi++;
            }
            if(last>max)max=last;
        }
        return max;
    }
}
