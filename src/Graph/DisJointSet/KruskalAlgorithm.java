package Graph.DisJointSet;

import java.util.PriorityQueue;

public class KruskalAlgorithm {
    public static void main(String[] args) {
        int[][]arr={
                {0,1,5},
                {1,2,3},
                {0,2,1}
        };
        System.out.println(kruskalsMST(3,arr));
    }
    static class Pair{
        int weight;
        int u;
        int v;
        Pair(int weight,int u,int v){
            this.weight=weight;
            this.u=u;
            this.v=v;
        }
    }
    public static int kruskalsMST(int V, int[][] edges) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        for(int[]row:edges){
            pq.add(new Pair(row[2],row[1],row[0]));
        }
        //now priority queue is prepared just chekc if element already exist in the graph or not
        DisjointSetPractice ds=new DisjointSetPractice(V);
        int sum=0;
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            if(ds.findParent(cur.u)!=ds.findParent(cur.v)){
                sum+=cur.weight;
                ds.unionByRank(cur.u,cur.v);
            }
        }
        return sum;
    }
}
