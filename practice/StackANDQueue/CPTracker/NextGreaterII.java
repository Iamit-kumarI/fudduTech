package StackANDQueue.CPTracker;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterII {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            int cur=i%n;
//            if(!stack.isEmpty()){
                while(!stack.isEmpty()&&nums[stack.peek()]<nums[cur]){
                    ans[stack.pop()]=nums[cur];
                }
//            }
            if(i<n)stack.push(cur);
        }
        return ans;
    }
}
