package com.zhu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉搜索树的后序序列 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length<=0) return false;

        return VerifySquenceOfBSTRecursion(sequence,0,sequence.length-1);


    }

    public boolean VerifySquenceOfBSTRecursion(int [] sequence,int start,int end) {

        int rootIndex = end;
        int i=start;
        for(;i<rootIndex;++i){
            if(sequence[i]>sequence[rootIndex]) break;
        }
        for(int j=i;j<rootIndex;++j){
            if(sequence[j]<sequence[rootIndex]) return false;
        }
        boolean left = true;
        boolean right = true;
        if(i>start) left = VerifySquenceOfBSTRecursion(sequence,start,i-1);
        if(i<end)  right = VerifySquenceOfBSTRecursion(sequence,i,end-1);
        return (left && right);
    }
}
