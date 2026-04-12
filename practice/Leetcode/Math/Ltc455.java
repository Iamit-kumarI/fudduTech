package Leetcode.Math;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Ltc455 {
    public static void main(String[] args) {
        int[]arr={1,2};
        int[]arr1={1,2,3};
        System.out.println(findContentChildren(arr,arr1));
    }
    public static int findContentChildren(int[] g, int[] s) {
        PriorityQueue<Integer>pqg=new PriorityQueue<>(Arrays.stream(g).boxed().toList());
        PriorityQueue<Integer>pqs=new PriorityQueue<>(Arrays.stream(s).boxed().toList());
        int minlen=Math.min(g.length,s.length),ans=0;
        while(!pqg.isEmpty()&&!pqs.isEmpty()){
            int curg=pqg.poll(),curs=pqs.poll();
            if(curs>=curg){
                ans++;
            }else{
                pqg.add(curg);
            }
        }
        return ans;
    }
}
