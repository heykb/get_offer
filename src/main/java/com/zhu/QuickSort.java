package com.zhu;

import java.util.ArrayList;

public class QuickSort {
    public static void quickSort(Integer[] in,int start,int end){
        if(start >= end){
            return;
        }
        int left = start;
        int right = end;
        int mid=left;
        while(left < right){
            while(in[right]>=in[mid] && left < right){
                right--;
            }
            while(in[left]<=in[mid] && left < right) {
                left++;
            }
            if(left < right ){
                int temp = in[left];
                in[left] = in[right];
                in[right] = temp;
            }
        }
        {
            int temp = in[mid];
            in[mid] = in[left];
            in[left] = temp;
        }
        quickSort(in,start,left-1);
        quickSort(in,left+1,end);
    }

    public static void main(String[] args) {


    }
}
