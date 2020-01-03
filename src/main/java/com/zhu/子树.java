package com.zhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 子树 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean isFound = false;
        if(root1!=null && root2!=null){
            if(root1.val == root2.val) isFound = root1HasRoot2(root1,root2);
            if(!isFound) {
                isFound = (HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2));
            }

        }
        return isFound;
    }
    boolean root1HasRoot2(TreeNode root1,TreeNode root2){
        if(root2 == null) return true;
        else if(root1 == null) return false;
        else{
            if(root1.val == root2.val){
                return root1HasRoot2(root1.left, root2.left)
                        && root1HasRoot2(root1.right, root2.right);
            }else return false;
        }


    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(null);
    }
}
