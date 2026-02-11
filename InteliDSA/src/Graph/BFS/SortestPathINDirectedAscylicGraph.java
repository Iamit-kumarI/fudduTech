package Graph.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SortestPathINDirectedAscylicGraph {
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void topoSort(int node, ArrayList<ArrayList<Pair>>adj, int[]visited, Stack<Integer>stack){
        visited[node]=1;
        for(int i=0;i<adj.get(node).size();i++){
            int cur=adj.get(node).get(i).first;
            if(visited[cur]==0){
                topoSort(cur,adj,visited,stack);
            }
        }
        stack.add(node);
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            ArrayList<Pair>temp=new ArrayList<>();
            adj.add(temp);
        }
        for(int i=0;i<E;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        int[]visited=new int[V];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                topoSort(i,adj,visited,stack);
            }
        }
        int[]distance=new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;
        while (!stack.isEmpty()){
            int node=stack.peek();
            stack.pop();
            for(int i=0;i<adj.get(node).size();i++){
                int v=adj.get(node).get(i).first;
                int wt=adj.get(node).get(i).second;
                if(distance[node] != Integer.MAX_VALUE &&distance[node]+wt<distance[v]){
                    distance[v]=distance[node]+wt;
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
