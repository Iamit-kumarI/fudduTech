package Graph.DisJointSet;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][]arr={
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        System.out.println(findCircleNum(arr));
    }
    public static int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        DisjointSetPractice ds=new DisjointSetPractice(n);
        int provinces=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    if(ds.findParent(i)!=ds.findParent(j)){
                        n--;
                        ds.unionByRank(i,j);
                    }

                }
            }
        }
        return provinces;
    }
}
