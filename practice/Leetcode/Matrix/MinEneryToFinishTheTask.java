package Leetcode.Matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinEneryToFinishTheTask {
    public static void main(String[] args) {
        int[][]arr={
                {1,2},
                {2,4},
                {4,8}
        };
        System.out.println(minimumEffort(arr));
    }
    static class Pair{
        int eq,srq;
        Pair(int eq,int srq){
            this.eq=eq;
            this.srq=srq;
        }
    }
    public static int minimumEffort(int[][] tasks) {
        List<Pair> list=new ArrayList<>();
        for(int[]row:tasks){
            list.add(new Pair(row[0],row[1]));
        }
        list.sort((a,b)->Integer.compare(b.srq,a.srq));
        int engery=0,ans=0;
        for(Pair cur:list){
            int act=cur.eq;
            int req=cur.srq;
            if(act<req){
                ans+=(req-act);
                engery=req;
            }
            engery-=act;
        }
        return ans+1;
    }
}
