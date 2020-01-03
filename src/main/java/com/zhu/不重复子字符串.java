package com.zhu;

import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

public class 不重复子字符串 {
    /**
     * 动态规划  f(i) 表示第i个字符为结尾的最大字符串长度
     * @param str
     * @return
     */
    public static String solution(String str){


        int fn_1 = 0;
        int max = fn_1;
        int index=0;
        for(int i=0;i<str.length();++i){
            int j=i-1;
            int tmp = fn_1;
            while(tmp>0){
                if(str.charAt(j) == str.charAt(i)) break;
                --j;
                --tmp;
            }

            if(tmp>0) fn_1=i-j;
            else fn_1 = fn_1+1;

            if(fn_1 >= max){
                max = fn_1;
                index = i;
            }
        }

        return str.substring(index-max+1,index+1);
    }

    public static void main(String[] args) {
        System.out.println(solution("arabcacfr"));
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }
}
