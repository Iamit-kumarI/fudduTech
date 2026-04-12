package Leetcode.Weekly.Weekly491;

import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(minCost(4));
    }
    public static int minCost(int n) {
        int a,b;
        int operations=0;
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(n);
        while(!queue.isEmpty()){
            int cur=queue.poll();
            if(cur==1)break;
            if(isEven(cur)){
                a=cur/2;
                b=cur/2;
            }else{
                a=cur/2;
                b=(cur/2)+1;
            }
            operations+=a*b;
            if(isEven(a)){
                queue.offer(a/2);
                queue.offer(a/2);
            }else{
                queue.offer(a/2);
                queue.offer((a/2)+1);
            }
            if(isEven(b)){
                queue.offer(b/2);
                queue.offer(b/2);
            }else{
                queue.offer(b/2);
                queue.offer((b/2)+1);
            }
        }
        return operations;
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
}
