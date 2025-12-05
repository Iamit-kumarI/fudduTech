package Leetcode.StackAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteriodCollision {
    public static void main(String[] args) {
        int[]nums={3,5,-6,2,-1,4};
        System.out.println(Arrays.toString(asteroidCollision(nums)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        stack.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            int peek=stack.pop();
            if(asteroids[i]<0&&peek>0){
                if(Math.abs(peek)>asteroids[i])stack.push(peek);
                else {
                    stack.pop();
                    stack.push(asteroids[i]);
                }
            }
        }
        int[]arr=new int[stack.size()];
        int index=0;
        while(!stack.isEmpty()){
            arr[index++]=stack.pop();
        }
        return arr;
    }
}
