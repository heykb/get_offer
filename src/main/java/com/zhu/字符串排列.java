package com.zhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class 字符串排列 {
    /**
     * f(n) =  a(i) + f(n-1)
     * n==1 return str;
     * @param str
     * @return
     */
    //所有的排列
    static public ArrayList<String> Permutation(String str) {

        TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Permutation(set,str.toCharArray(),0);
        ArrayList<String> list =  new ArrayList();
        for(String s: set){
            list.add(s);
        }
        return list;

    }
    static void Permutation(TreeSet<String> set,char[] str , int index){
        if(index==str.length-1){
            set.add(str.toString());
        }else{
            for(int i=index;i<str.length;i++){
                char tmp = str[index];
                str[index] = str[i];
                str[i] = tmp;
                Permutation(set, str, index+1);
                tmp = str[index];
                str[index] = str[i];
                str[i] = tmp;
            }
        }
    }

    /**
     * f(n) = m(1)+m(2)+...m(n)
     * m(n) =  m(n-1)+m(n)
     * @param str
     */
//求所有的组合
    static void Permutation(char[] str){
        for(int i=1;i<=str.length;++i){
            Permutation(str,0,"",i);
        }
    }
    static void Permutation(char[] str,int start,String prefix,int m){
        if(m==0){
            System.out.println(prefix);
            return ;
        }
        if(str.length-start == m) {
            System.out.println(prefix+String.valueOf(str).substring(start));
            return;
        }
        Permutation(str,start+1,prefix+str[start],m-1);
        Permutation(str,start+1,prefix,m);
    }
    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        for(int i=0;i<s.length;++i){
            StringBuffer tmp = new StringBuffer();
            for(int j=i;j<s.length;++j){
                tmp.append(s[j]);

                System.out.println(tmp);
            }
        }

    }
}
