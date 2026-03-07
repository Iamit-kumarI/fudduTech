package Graph.DisJointSet;

import java.util.stream.Collectors;

public class NoOfOperationsToMakeNetworkConnected {
    public static void main(String[] args) {
        int[][]arr={
                {0,1},
                {0,2},
                {0,3},
                {1,2},
        };
        System.out.println(makeConnected(5,arr));
    }
    public static int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)return -1;//we don't have enough edges
        DisjointSet ds=new DisjointSet(n);
        for(int[]row:connections){
            if(ds.findParent(row[0])!=ds.findParent(row[1])){
                ds.unionByRank(row[0],row[1]);
            }
        }
        System.out.println(ds.parent);
        int ans=0;
        for(int i=0;i<n;i++){
            if(ds.findParent(i)==i)ans++;
        }
        return ans-1;
    }
}
