package StackANDQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________STACK________________________");
        DynamicStack stack=new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        //inserting after size now see size*2 magic
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.display();

        // Queue
        System.out.println("__________________________QUEUE________________________");
        DynamicQueue queue=new DynamicQueue();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.display();
        System.out.println(queue.pop());
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);

        queue.display();
        System.out.println(queue.pop());
        queue.display();
    }
}
