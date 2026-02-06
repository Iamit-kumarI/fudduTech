package Graph.DFS;

import java.util.ArrayList;
import java.util.Collections;

public class TOPOSort {
    public static void main(String[] args) {
        int[][]edges={{1, 3},{2, 3}, {4, 1}, {4, 0}, {5, 0}, {5, 2}};
        System.out.println(topoSort(6,edges));
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[]row:edges){
            adj.get(row[0]).add(row[1]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        int[]visited=new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                dfs(i,adj,visited,list);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>>adj,int[]visited,ArrayList<Integer>list){
        list.add(node);
        visited[node]=1;
        for(int cur:adj.get(node)){
            if(visited[cur]!=1)
            dfs(cur,adj,visited,list);
        }
    }
}
