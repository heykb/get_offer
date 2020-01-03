package com.zhu;

import java.util.ArrayList;

public class 倒数k个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        if(input==null) return list;
        if(k>input.length || k<=0) return list;

        int end = input.length-1;
        int index = partition(input,0,end);
        while(index+1!=k){
            if(index+1 > k) index = partition(input,0,index-1);
            else index = partition(input,index+1,end);
        }
        for(int i=0;i<k;++i){
            list.add(input[i]);
        }
        return list;
    }
    public int partition(int[] arr, int start, int end){
        int mid = arr[start];
        while(start<end){
            while(start<end && arr[end]>=mid) --end;
            arr[start] = arr[end];
            while(start<end && arr[start]<=mid) ++start;
            arr[end]=arr[start];
        }
        arr[start]=mid;
        return start;
    }
    public static void main(String[] args) {
        ;
    }
}
