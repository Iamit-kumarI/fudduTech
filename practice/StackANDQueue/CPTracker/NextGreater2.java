package StackANDQueue.CPTracker;

import java.util.Stack;

// --h
public class NextGreater2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,3};
        System.out.println(nextGreaterElement(arr));
    }
    public static int[]nextGreaterElement(int[]nums){
        Stack<Integer>stack=new Stack<>();
        int[]ans=new int[nums.length];
        int ansIndex=0;
        for(int val:nums){
            if(!stack.isEmpty()&&stack.peek()<val){
                ans[ansIndex++]=val;
            }else if(!stack.isEmpty()&&stack.peek()>val){

            }else{
                stack.push(val);
            }
        }
        return ans;
    }
}
