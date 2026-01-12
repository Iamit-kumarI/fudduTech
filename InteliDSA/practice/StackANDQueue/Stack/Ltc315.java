package StackANDQueue.Stack;

import java.util.*;

import static java.util.Collections.*;

public class Ltc315 {
    public static void main(String[] args) {
        int[]arr={5,2,6,1};
        System.out.println(countSmaller(arr));
    }
    public static List<Integer> countSmaller(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        Collections.addAll(stack, Arrays.stream(nums).boxed().toArray(Integer[]::new));
        List<Integer>list=new ArrayList<>();
        int index=0;
        list.add(0);
        while(!stack.isEmpty()){
            int peek=stack.peek();
            stack.pop();
            int pop=stack.peek();
            if(pop>=peek)list.add(list.get(index++));
            else {
                list.add(list.get(index++)+1);
            }
        }
        return list.reversed();
    }
}
