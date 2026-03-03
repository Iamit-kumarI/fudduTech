package Graph.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    public static void main(String[] args) {
        int[][]arr={
                {0, 1, 5},
                {1, 2, 3},
                {0, 2, 1}
        };
        System.out.println(spanningTree(3,arr));
    }
    static class Pair{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
    }
    public static int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<ArrayList<Integer>>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[]row:edges){
            int u=row[0];
            int v=row[1];
            int w=row[2];
            adj.get(u).add(new ArrayList<>(Arrays.asList(v,w)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u,w)));
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        int[]visited=new int[V];
        pq.add(new Pair(0,0));
        int sum=0;
        while (!pq.isEmpty()){
            int weight=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            if(visited[node]==1)continue;
            visited[node]=1;
            sum+=weight;
            for(ArrayList<Integer> curNode:adj.get(node)){
                int adjNode=curNode.get(0);
                int adjWeight=curNode.get(1);
                if(visited[adjNode]==0){
                    pq.add(new Pair(adjNode,adjWeight));
                }
            }
        }
        return sum;
    }
}
