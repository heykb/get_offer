package com.zhu;

import java.util.Stack;

public class 栈的压入弹出序列 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        int j=0;
        while(j < popA.length){
            if(stack.isEmpty()) stack.push(pushA[i++]);
            if(stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }else {
                if(i>=pushA.length) break;
                else stack.push(pushA[i++]);
            }
        }
        if(j==popA.length) return true;
        else return false;

    }
}
