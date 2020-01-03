package com.zhu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class 打印1到最大的n位数 {
    static void printMaxDights(int n){

        if(n<0) return ;
        char[] out = new char[n];
        printMax(n,0,out);
       List<Integer> list = new ArrayList<>();


    }
    static void printMax(int n,int index,char[] out){
        if(n==0) return;
        for(int i =0;i<10;i++){
            out[index] = (char) (i+'0');
            if(n==1) System.out.println(out);
            printMax(n-1,index+1,out);
        }
    }
    public static void main(String[] args) {
        printMaxDights(3);
    }

}
