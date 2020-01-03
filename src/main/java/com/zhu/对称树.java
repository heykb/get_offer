package com.zhu;

public class 对称树 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return isSymmetricalRecursion(pRoot,pRoot);
    }

    boolean isSymmetricalRecursion(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val != root2.val) return false;

        return isSymmetricalRecursion(root1.left,root2.right)
                && isSymmetricalRecursion(root1.right,root2.left);


    }
}
