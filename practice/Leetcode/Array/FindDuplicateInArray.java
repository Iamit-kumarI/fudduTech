package Leetcode.Array;

import java.util.*;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,5,3,4,2,1};
        System.out.println(Arrays.toString(duplicate(arr)));
    }
    public static int[] duplicate(int[]arr){
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int val:arr){
            if(set.contains(val))list.add(val);
            else set.add(val);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
