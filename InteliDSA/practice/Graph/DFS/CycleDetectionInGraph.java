package Graph.DFS;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionInGraph {
    public static void main(String[] args) {
        int[][]arr={
                {1,0},
                {0,1}
        };
        System.out.println(canFinish(2,arr));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)adj.add(new ArrayList<>());
        for(int []val:prerequisites){
            adj.get(val[1]).add(val[0]);
        }
        int[]visited=new int[numCourses];
        int[]currentPath=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                if(dfs(adj,i,visited,currentPath))return false;
            }
        }
        return true;
    }
    public static boolean dfs(List<List<Integer>>adj,int node,int[]visited,int[]currentPath){
        visited[node]=1;
        currentPath[node]=1;
        for(int cur:adj.get(node)){
            if(visited[cur]==0){
                if(dfs(adj,cur,visited,currentPath))return true;
            }else if(currentPath[cur]==1)return true;
        }
        currentPath[node]=0;
        return false;
    }
}
