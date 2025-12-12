package Leetcode.Matrix;

import java.util.HashSet;
import java.util.Set;

public class POTDLtc3531 {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int count=0;
        if(n<=2)return 0;
        Set<String> set=new HashSet<>();
        for(int[]row:buildings)set.add(row[0]+" "+row[1]);
        for(int i=2;i<=n-1;i++){
            for(int j=2;j<=n-1;j++){
                if(isCovered(set,i,j)&&isCovered(set,i-1,j)&&isCovered(set,i+1,j)&&isCovered(set,i,j+1)&&isCovered(set,i,j-1))count++;
            }
        }
        return count;
    }
    public boolean isCovered(Set<String>set,int i,int j){
        return set.contains(i+" "+j);
    }
}
