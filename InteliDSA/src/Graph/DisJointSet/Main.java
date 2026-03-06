package Graph.DisJointSet;

public class Main {
    public static void main(String[] args) {
        //implementing disjoint set
        DisjointSet disjointSet=new DisjointSet(7);
        disjointSet.unionByRank(1,2);
        disjointSet.unionByRank(2,3);
        disjointSet.unionByRank(4,5);
        disjointSet.unionByRank(6,7);
        disjointSet.unionByRank(5,6);
        if(disjointSet.findParent(3)==disjointSet.findParent(7)){
            System.out.println("Same");
        }else System.out.println("Not same");
        disjointSet.unionByRank(3,7);
        if(disjointSet.findParent(3)==disjointSet.findParent(7)){
            System.out.println("Same");
        }else System.out.println("Not same");
    }
}
