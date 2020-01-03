package com.zhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 连续子数组的最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int maxI_1Sum = 0;
        for(int i=0;i<array.length;++i){
            if(maxI_1Sum<=0){
                maxI_1Sum = array[i];
            }else{
                maxI_1Sum +=array[i];
            }
            if(maxSum<maxI_1Sum) maxSum = maxI_1Sum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(3+"");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
    }
}
