package Leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheFurthestHouseWithDistanceColor {
    public static void main(String[] args) {
        int[]arr={1,8,3,8,3};
        System.out.println(maxDistance(arr));
    }
    public static int maxDistance(int[] colors) {
        int ans=Integer.MIN_VALUE,n=colors.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(colors[i]))continue;
            else{
                //traverse over map find the value that dosen't match to cur [i]
                // and update the index with ans,i-map.get();//the value we have find in the map
            }
        }
        return ans;
    }
}
