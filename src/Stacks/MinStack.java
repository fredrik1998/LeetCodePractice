package Stacks;

import java.util.Stack;

public class MinStack {
    private final Stack<Integer> MAINSTACK;
    private final Stack<Integer> MINSTACK;

    public MinStack() {
        MAINSTACK = new Stack<>();
        MINSTACK = new Stack<>();
    }

    public void push(int val) {
        MAINSTACK  .push(val);

        if(MAINSTACK.isEmpty() || val <= MINSTACK.peek()){
            MINSTACK.push(val);
        } else {
            MINSTACK.push(MINSTACK.peek());
        }
    }

    public void pop() {
        MAINSTACK  .pop();
        MINSTACK.pop();
    }

    public int top() {
        return MAINSTACK.peek();
    }

    public int getMin() {
        return MINSTACK.peek();
    }
}
