package com.zhu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class 二叉搜索树转双向链表 {
    public TreeNode Convert(TreeNode root) {

        if(root==null) return root;
        TreeNode leftStart = root;
        if(root.left!=null){
            leftStart = Convert(root.left);
            TreeNode cur = leftStart;
            while(cur.right!=null){
                cur=cur.right;
            }
            cur.right = root;
            root.left = cur;
        }
        if(root.right!=null){
            TreeNode rightStart = Convert(root.right);
            root.right = rightStart;
            rightStart.left = root;
        }

        return leftStart;
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        ArrayList list = new ArrayList(set);
        list.addAll(set);
    }
}
