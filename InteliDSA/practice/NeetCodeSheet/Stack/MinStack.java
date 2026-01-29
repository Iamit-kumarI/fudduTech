package NeetCodeSheet.Stack;

import java.util.Stack;

public class MinStack {
    class MinStacka {
        Stack<Integer>stack;
        public MinStacka() {
            stack=new Stack<>();
        }
        public void push(int val) {
            stack.push(val);
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
           return stack.stream().sorted().toList().get(0);
        }
    }
}
