package com.zhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 数组排成最小的数 {
    public String PrintMinNumber(int [] numbers) {

        ArrayList<String> list = new ArrayList<>();
        for(int i:numbers) list.add(i+"");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        String re="";
        for(String s:list){
            re+=s;
        }
        return  re;
    }
}
