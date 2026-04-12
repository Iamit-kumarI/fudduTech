package StackANDQueue.CPTracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NSE {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        System.out.println(nextSmallerEle(arr));
    }
    public static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        if(arr.length==0)return list;
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                stack.pop();
            }
//            list.add(0,stack.empty()?-1:stack.peek());
            list.add(stack.isEmpty()?-1:stack.peek());
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
        /* problem */
//        Stack<Integer>stack= IntStream.of(arr).boxed().collect(Collectors.toCollection(Stack::new));
//        ArrayList<Integer>list=new ArrayList<>();
//        if(arr.length==0)return list;
//        for(int i=0;i<arr.length;i++){
//            if(stack.isEmpty()){
//                list.add(-1);
//                stack.pop();
//            }else{
//                int cur=arr[i];
//                for(int val:stack){
//                    if(val<cur)cur=val;
//                }
//                list.add(cur==arr[i]?-1:cur);
//                stack.pop();
//            }
//        }
//        return list;
    }
}
