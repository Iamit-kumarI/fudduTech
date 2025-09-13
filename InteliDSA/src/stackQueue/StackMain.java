package stackQueue;

public class StackMain {
    public static void main(String[] args) throws StackE {
        /*
        CStack stack=new CStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.push(6);
        System.out.println(stack.peek());
        */
        DynamicStack dstack=new DynamicStack(5);
        dstack.push(1);
        dstack.push(2);
        dstack.push(3);
        dstack.push(4);
        dstack.push(5);
        dstack.push(6);
        /**
         * size is five but inserting 6 didn't give exception because now its doubling its size
         * so here now its size should be 10
         */
        System.out.println(dstack.peek());
    }
}
