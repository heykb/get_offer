package com.zhu;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class 栈和最小值 {
    Stack<Integer> value = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        if(min.isEmpty() || min.peek()>node) min.push(node);
        value.push(node);

    }

    public void pop() {
        if(value.peek() == min.peek()) min.pop();
        value.pop();
    }

    public int top() {
        return value.peek();
    }

    public int min() {
        return min.peek();
    }
}
