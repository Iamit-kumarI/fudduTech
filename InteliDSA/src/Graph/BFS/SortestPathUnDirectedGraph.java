package Graph.BFS;

import java.util.*;

public class SortestPathUnDirectedGraph {
    public int[] shortestPath(int V, int E, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[]row:edges){
            adj.get(row[0]).add(row[1]);
            adj.get(row[1]).add(row[0]);
        }
        int[]distance=new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;

        Queue<Integer>queue=new LinkedList<>();
        queue.offer(0);

        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int neighbor:adj.get(node)){
                if(distance[node]+1<distance[neighbor]){
                    distance[neighbor]=distance[node]+1;
                    queue.add(neighbor);
                }
            }
        }
        for(int i=0;i<V;i++){
            if(distance[i]==Integer.MAX_VALUE){
                distance[i]=-1;
            }
        }
        return distance;
    }
}
