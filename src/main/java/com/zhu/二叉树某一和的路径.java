package com.zhu;

import java.util.ArrayList;

public class 二叉树某一和的路径 {
    ArrayList<ArrayList<Integer>> reList = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> tmpList = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return reList;
        tmpList.add(root.val);
        target-=root.val;
        if(target==0 && root.left==null && root.right==null)
            reList.add(new ArrayList<Integer>(tmpList));
        FindPath(root.left,target);
        FindPath(root.right,target);
        tmpList.remove(tmpList.size()-1);
        return reList;
    }
}
