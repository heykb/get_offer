package com.zhu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上往下打印二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> reList = new ArrayList<>();
        if(root == null) return reList;
        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);
        while(!que.isEmpty()){
            TreeNode cul = que.poll();
            reList.add(cul.val);
            if(cul.left != null) que.offer(cul.left);
            if(cul.right != null) que.offer(cul.right);
        }
        return reList;
    }
    ArrayList<ArrayList<Integer> > Print(TreeNode root) {
        ArrayList<ArrayList<Integer> > reList= new ArrayList<>();
        if(root == null) return reList;
        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);
        int curLevelNodes = 1;
        int nextLevelNodes = 0;
        ArrayList<Integer> tmpList = new ArrayList<>();
        while(!que.isEmpty()){
            TreeNode cul = que.poll();
            tmpList.add(cul.val);
            if(cul.left != null) {
                ++nextLevelNodes;
                que.offer(cul.left);
            }
            if(cul.right != null) {
                ++nextLevelNodes;
                que.offer(cul.right);
            }
            --curLevelNodes;
            if(curLevelNodes==0){
                reList.add(tmpList);
                tmpList = new ArrayList<>();
                curLevelNodes = nextLevelNodes;
                nextLevelNodes = 0;
            }
        }
        return reList;
    }
}
