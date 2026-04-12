package NeetCodeSheet.ArraysHashing;

import java.util.*;

public class ToKFrequentElement {
    public static void main(String[] args) {
        int[]arr={1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums)map.put(val,map.getOrDefault(val,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        pq.addAll(map.entrySet());
        int[]ans=new int[k];
        while(k-->0){
            Map.Entry<Integer,Integer>cur=pq.poll();
            ans[k]=cur.getValue();
        }
        return ans;
    }
}
