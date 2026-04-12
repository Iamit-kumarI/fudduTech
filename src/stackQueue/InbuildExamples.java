package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuildExamples {
    public static void main(String[] args) {
        /*Stack*/
        /*
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.get(0));//gets values according to index
        System.out.println(stack.peek()); //gets values according to position in stack top first
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
           */
        /*Queues*/
        /*Queue<Integer> queue=new Queue<Integer>(){
            //can't do that becz its an interface in order to do that we have to @Override
            //Queue's method
        }*/
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek());
        queue.remove();//its ok to write this but this returns interger as well
        System.out.println("removed "+queue.remove()+" from the Queue");
        System.out.println(queue.peek());

    }
}
