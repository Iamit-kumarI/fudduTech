package Graph.DFS;

import java.util.ArrayList;

public class CourseSchedule {
    public static void main(String[] args) {
        int[][]prerequisites={{1,0},{0,1}};
        System.out.println(canFinish(2,prerequisites));
    }
    // its a simple problem asks us to check if ther is cycle in graph or not
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)adj.add(new ArrayList<>());
        for(int[]row:prerequisites){
            adj.get(row[0]).add(row[1]);
        }
        int[]visited=new int[numCourses];
        int[]currentPath=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                if(dfs(i,adj,visited,currentPath))return false;
            }
        }
        return true;
    }
    public static boolean dfs(int node,ArrayList<ArrayList<Integer>>adj,int[]visited,int[]currentPath){
        visited[node]=1;
        currentPath[node]=1;
        for(int cur:adj.get(node)){
            if(visited[cur]==0){
                if(dfs(cur,adj,visited,currentPath))return true;
            }else if(currentPath[cur]==1)return true;
        }
        currentPath[node]=0;
        return false;
    }
}
