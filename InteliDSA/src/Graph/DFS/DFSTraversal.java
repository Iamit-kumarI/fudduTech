package Graph.DFS;
import java.util.ArrayList;

public class DFSTraversal {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[]visited=new boolean[adj.size()];
        ArrayList<Integer>ans=new ArrayList<>();
        helper(0,visited,adj,ans);
        return ans;
    }
    public static void helper(int node,boolean[]visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>list){
        visited[node]=true;
        list.add(node);
        for(Integer val:adj.get(node)){
            if(!visited[val])helper(node,visited,adj,list);
        }
    }
}
