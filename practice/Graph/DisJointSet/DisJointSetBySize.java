package Graph.DisJointSet;

public class DisJointSetBySize {
    int []rank,size,parent;
    DisJointSetBySize(int n){
        rank=new int[n+1];
        size=new int[n+1];
        parent=new int[n+1];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int findParent(int node){
        if(node==parent[node])return node;
        return parent[node]=findParent(parent[node]);
    }
    public void unionByRank(int u,int v){
        int ulpU=findParent(u);
        int ulpV=findParent(v);
        if(ulpV==ulpU)return;
        if(rank[ulpU]<rank[ulpV])parent[ulpU]=ulpV;
        else if(rank[ulpV]<rank[ulpU])parent[ulpV]=ulpU;
        else{
            parent[ulpV]=ulpU;
            rank[ulpU]++;
        }
    }
    public void unionBySize(int u,int v){
        int ulpU=findParent(u);
        int ulpV=findParent(v);
        if(ulpV==ulpU)return;
        if(size[ulpU]<size[ulpV]){
            parent[ulpU]=ulpV;
            size[ulpV]+=size[ulpU];
        }else{
            parent[ulpV]=ulpU;
            size[ulpU]+=size[ulpV];
        }
    }
}
