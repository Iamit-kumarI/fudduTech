package Graph.DisJointSet;

import java.util.*;

public class MaximumSpanningTreeStabilityWithUpgrade {
    public static void main(String[] args) {
        int[][]arr={
                {0,1,2,1},
                {1,2,3,0}
        };
        System.out.println(maxStability(3,arr,1));
    }
    static class DjsClass{
        List<Integer>parent=new ArrayList<>();
        List<Integer>rank=new ArrayList<>();
        DjsClass(int n){
            for(int i=0;i<n;i++){
                rank.add(0);
                parent.add(i);
            }
        }
        public int findParent(int node){
            if(node==parent.get(node))return node;
            int ultiMateParent=findParent(parent.get(node));
            parent.set(node,ultiMateParent);
            return ultiMateParent;
        }
        public void unionByRank(int u,int v){
            int ultiMateParentU=findParent(u);
            int ultiMateParentV=findParent(v);
            if(ultiMateParentV==ultiMateParentU)return;
            if(rank.get(ultiMateParentU)<rank.get(ultiMateParentV)){
                parent.set(ultiMateParentU,ultiMateParentV);
            }else if(rank.get(ultiMateParentV)<rank.get(ultiMateParentU)){
                parent.set(ultiMateParentV,ultiMateParentU);
            }else{
                parent.set(ultiMateParentV,ultiMateParentU);
                int rankU=rank.get(ultiMateParentU);
                rank.set(ultiMateParentU,rankU+1);
            }
        }
    }
    static class Pair{
        int u,v,s,must;
        Pair(int u,int v,int s,int must){
            this.u=u;
            this.v=v;
            this.s=s;
            this.must=must;
        }
    }
    public static int maxStability(int n, int[][] edges, int k) {
        DjsClass ds=new DjsClass(n);
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.s-b.s);//sorted bases on wright
        Queue<Pair>queue=new LinkedList<>();
        for(int[]row:edges){
            if(row[3]==1){
                queue.offer(new Pair(row[0],row[1],row[2],row[3]));
                pq.offer(new Pair(row[0],row[1],row[2],row[3]));
            }else pq.offer(new Pair(row[0],row[1],row[2]*2,row[3]));

        }
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(ds.findParent(cur.u)==ds.findParent(cur.v))return -1;//cycle found
            else ds.unionByRank(cur.u,cur.v);
        }
        int ans=0;
        while(!pq.isEmpty()&&k-->0){
            ans+=pq.poll().s;
        }
        return ans;
    }
}
