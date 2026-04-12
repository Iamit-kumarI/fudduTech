package StackANDQueue.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[]arr={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr,3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[]ans=new int[nums.length-k+1];
        int index=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
            queue.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            ans[index++]=pq.peek();
            pq.remove(queue.poll());
            pq.add(nums[i]);
            queue.offer(nums[i]);
        }
        ans[index]=pq.peek();
        return ans;
    }
}
