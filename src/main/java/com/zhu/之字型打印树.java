package com.zhu;

import java.util.ArrayList;
import java.util.Stack;

public class 之字型打印树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer> > reList = new ArrayList<ArrayList<Integer> >();
        if(root==null) return reList;

        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        oddStack.push(root);

        while(!oddStack.isEmpty()){
            ArrayList<Integer> tmpList = new ArrayList<>();
            while(!oddStack.isEmpty()){
                TreeNode top = oddStack.pop();
                tmpList.add(top.val);
                if(top.left!=null) evenStack.push(top.left);
                if(top.right!=null) evenStack.push(top.right);
            }
            reList.add(tmpList);
            if(evenStack.isEmpty()) break;

            tmpList = new ArrayList<>();
            while(!evenStack.isEmpty()){
                TreeNode top = evenStack.pop();
                tmpList.add(top.val);
                if(top.right!=null) oddStack.push(top.right);
                if(top.left!=null) oddStack.push(top.left);
            }
            reList.add(tmpList);
        }
        return reList;
    }
}
