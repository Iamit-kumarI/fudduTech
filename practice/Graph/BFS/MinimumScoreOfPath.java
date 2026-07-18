package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumScoreOfPath{
    public static void main(String[] args) {
        int[][]arr={
                {1,2,9},
                {2,3,6},
                {2,4,5},
                {1,4,7}
        };
        System.out.println(minScore(4,arr));
    }
    public static int minScore(int n, int[][] roads) {
        List<List<int[]>>list=new ArrayList<>();
        for(int i=0;i<=n;i++)list.add(new ArrayList<>());
        for(int[]row:roads){
            list.get(row[0]).add(new int[]{row[1],row[2]});
            list.get(row[1]).add(new int[]{row[0],row[2]});
        }
        int ans=Integer.MAX_VALUE;
        boolean[]visited=new boolean[n+1];
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(1);
        while(!queue.isEmpty()){
            int curNode=queue.poll();
            for(int[]node:list.get(curNode)){
                ans=Math.max(ans,node[1]);
                if(!visited[node[0]]){
                    visited[node[0]]=true;
                    queue.offer(node[0]);
                }
            }
        }
        return ans;
    }
}
