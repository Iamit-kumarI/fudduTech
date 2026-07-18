package Graph.BFS;

import java.util.ArrayList;

public class NetworkRecoveryPathways{
    public static void main(String[] args) {
        int[][]edges={
                {0,1,5},
                {1,3,10},
                {0,2,3},
                {2,3,4}
        };
        boolean[]arr={true,true,true,true};
        System.out.println(findMaxPathScore(edges,arr,10));
    }
    public static int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n=online.length;
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[]row:edges){
            int u=row[0],v=row[1],cost=row[2];
            list.get(u).add(v);
        }
        return 1;
    }
}
