package com.zhu;

import java.util.Arrays;
import java.util.Iterator;

public class 树序列化反序列化 {
    String Serialize(TreeNode root) {
        if(root==null) return "#!";
        StringBuffer str = new StringBuffer();
        str.append(root.val+"!");
        str.append(Serialize(root.left));
        str.append(Serialize(root.right));
        return str.toString();
    }
    TreeNode Deserialize(String str) {
        if(str == null) return null;
        String[] nodes = str.split("!");

        return Deserialize(Arrays.asList(nodes).iterator());
    }
    TreeNode Deserialize(Iterator<String> it) {
        if(!it.hasNext()) return null;
        String str = it.next();
        if("#".equals(str)) return null;

        TreeNode root = new TreeNode(Integer.parseInt(str));
        root.left = Deserialize(it);
        root.right = Deserialize(it);
        return root;
    }
}
