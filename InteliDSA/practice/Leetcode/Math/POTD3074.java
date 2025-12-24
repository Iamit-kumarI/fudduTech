package Leetcode.Math;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class POTD3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum=0;
        for(int val:apple)appleSum+=val;
        Arrays.sort(capacity);
        int count=0,index=capacity.length-1;
        while(appleSum>0){
            appleSum-=capacity[index--];
            count++;
        }
//        PriorityQueue<Integer>pqueue=new PriorityQueue<>(Collections.reverseOrder());
//        for(int val:capacity)pqueue.offer(val);
//        int count=0;
//        while(appleSum>1){
//            count++;
//            appleSum-=pqueue.poll();
//        }
        return count;
    }
}
