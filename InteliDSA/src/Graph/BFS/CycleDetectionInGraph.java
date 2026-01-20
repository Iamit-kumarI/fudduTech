package Graph.BFS;

import java.util.*;

public class CycleDetectionInGraph {
    public boolean isCycle(int V, int[][] edges) {
       boolean[]visited=new boolean[V];
        Arrays.fill(visited,false);
         
        //converting array to adj list
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<V;i++)list.add(new ArrayList<>());
        for(int[]row:edges){
            list.get(row[0]).add(row[1]);
            list.get(row[1]).add(row[0]);
        }

        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(checkCycle(i,V,list,visited))return true;
            }
        }
        return false;
    }
    public class Pair{
        int val;
        int cameFrom;
        Pair(int val,int cameFrom){
            this.val=val;
            this.cameFrom=cameFrom;
        }
    }
    public boolean checkCycle(int i,int v,List<List<Integer>>adj,boolean[]visited){
        visited[i]=true;
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(i,-1));
        while(!queue.isEmpty()){
            int node=queue.peek().val;
            int camFrom=queue.peek().cameFrom;//cameFrom is parent
            queue.poll();
            for(int cur:adj.get(node)){
                if(!visited[cur]){
                    visited[cur]=true;
                    queue.add(new Pair(cur,node));
                }else if(camFrom!=cur)return true;
            }
        }
        return false;
    }
}
