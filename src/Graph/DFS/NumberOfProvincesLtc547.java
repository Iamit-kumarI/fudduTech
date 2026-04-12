package Graph.DFS;

import java.util.ArrayList;

public class NumberOfProvincesLtc547 {
    public int findCircleNum(int[][] isConnected) {
        boolean[]visited=new boolean[isConnected.length*isConnected[0].length];
        int ans=0;
        visited[0]=true;
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                ans++;
                helper(i,isConnected,visited,visited.length);
            }
        }
        return ans;
    }
    public static void helper(int node,int[][]adj,boolean[]visited,int V){
        visited[node]=true;
        for(int i=0;i<V;i++){
            if(adj[node][i]==1&&!visited[i])helper(i,adj,visited,V);
        }
    }
}
