package Graph.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    class Pair{
        int dist;
        int node;
        Pair(int node,int dist){
            this.dist=dist;
            this.node=node;
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[]row:edges){
            int u=row[0];
            int v=row[1];
            int w=row[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        int[]distance=new int[V];
        Arrays.fill(distance,(int)1e9);
        distance[src]=0;//temprary setting start source to 0
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair current=pq.poll();
            int curNode=current.node;
            int curDistance=current.dist;
            if(curDistance>distance[curNode])continue;
            for(Pair neighbuor:adj.get(curNode)){
                int nextNode=neighbuor.node;
                int weight=neighbuor.dist;
                if(curDistance+weight<distance[nextNode]){
                    distance[nextNode]=curDistance+weight;
                    pq.add(new Pair(nextNode,distance[nextNode]));
                }
            }
        }
        return distance;
    }
}
