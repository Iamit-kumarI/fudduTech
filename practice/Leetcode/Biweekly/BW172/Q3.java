package Leetcode.Biweekly.BW172;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Q3 {
    public long maximumScore(int[] nums, String s) {
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>((val1,val2)->val2-val1);
        long res=0;
        for(int i=0;i<nums.length;i++){
            priorityQueue.add(nums[i]);
            if(s.charAt(i)=='1'){
                res+=priorityQueue.poll();
            }
        }
        return res;
    }
}
