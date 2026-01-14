package Graph.BFS;

import OPPs.Intro.Access.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[]visited=new boolean[adj.size()];
        ArrayList<Integer>list=new ArrayList<>();
        Queue<Integer>queue=new LinkedList<>();
        visited[0]=true;
        queue.offer(0);
        while(!queue.isEmpty()){
            Integer cur=queue.poll();
            list.add(cur);
            for(Integer val:adj.get(cur)){
                if(!visited[val]){
                    visited[val]=true;
                    queue.offer(val);
                }
            }
        }
        return list;
    }
}
