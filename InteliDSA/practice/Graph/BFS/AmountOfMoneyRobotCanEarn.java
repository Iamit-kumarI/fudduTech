package Graph.BFS;

import java.util.*;

public class AmountOfMoneyRobotCanEarn {
    public static void main(String[] args) {
        int[][]arr={
                {0,1,-1},
                {1,-2,3},
                {2,-3,4}
        };
        System.out.println(maximumAmount(arr));
    }
    static class Pair{
        int row;
        int col;
        List<Integer> encounters;
        int pathValue;
        Pair(int row,int col,List<Integer> encounters,int pathValue){
            this.row=row;
            this.col=col;
            this.encounters=encounters;
            this.pathValue=pathValue;
        }
    }
    public static int maximumAmount(int[][] coins) {
        int n=coins.length,m=coins[0].length;
        Queue<Pair>queue=new LinkedList<>();
        List<Integer>list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        if(coins[0][0]<0){
            list.add(coins[0][0]);
            queue.offer(new Pair(0,0,list,0));
        }
        else queue.offer(new Pair(0,0,list,coins[0][0]));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(cur.row==n-1&&cur.col==m-1){
                List<Integer>temp=new ArrayList<>(cur.encounters);
                Collections.sort(temp);
                int ans=cur.pathValue;
                while(temp.size()>2){
                    ans+=temp.get(0);
                    temp.remove(0);
                }
                max=Math.max(max,ans);
            }
            int[]allowedRow={0,1};
            int[]allowedCol={1,0};
            for(int i=0;i<2;i++){
                int newRow=allowedRow[i]+cur.row;
                int newCol=allowedCol[i]+cur.col;
                if(valid(n,m,newRow,newCol)){
                    List<Integer>newList=new ArrayList<>(cur.encounters);
                    if(coins[newRow][newCol]<0){
                        newList.add(coins[newRow][newCol]);
                        queue.offer(new Pair(newRow,newCol, newList,cur.pathValue+coins[newRow][newCol]));
                    }else{
                        queue.offer(new Pair(newRow,newCol,newList, cur.pathValue+coins[newRow][newCol]));
                    }
                }
            }
        }
        return max;
    }
    public static boolean valid(int n,int m,int row,int col){
        return row>=0&&row<n&&col>=0&&col<m;
    }
}
