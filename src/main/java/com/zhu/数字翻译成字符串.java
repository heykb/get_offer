package com.zhu;

public class 数字翻译成字符串 {
    static public int transactionNum(int num){
        String str = num+"";
        int[] countsI = new int[str.length()-1];

        for(int i=str.length()-1;i>=0;++i){
            int count=0;
            if(i==str.length()-1){
                countsI[i] = 1;
            }else{
                if(i<str.length()-1) {
                    count+=countsI[i+1];
                    Integer tmp = new Integer(str.charAt(i)+str.charAt(i+1));
                    if(tmp>=10 && tmp<=25) {
                        if(i+2<str.length()) count+=countsI[i+2];
                        else count+=1;
                    }
                }
                countsI[i] = count;
            }
        }

        return countsI[0];

    }
}
