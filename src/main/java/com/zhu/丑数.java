package com.zhu;

public class 丑数 {
    public int GetUglyNumber_Solution(int index) {
        if(index<7) return index;
        int p2=0,p3=0,p5=0;
        int[] arr=new int[index];
        arr[0] = 1;
        int cur = 1;
        while(cur<index){
            arr[cur] = min(arr[p2]*2,arr[p3]*3,arr[p5]*5);
            if(arr[p2]*2 == arr[cur]) ++p2;
            if(arr[p3]*3 == arr[cur]) ++p3;
            if(arr[p5]*5 == arr[cur]) ++p5;
            ++cur;
        }
        return arr[index-1];
    }

    int min(int a,int b, int c){
        int min = a;
        if(b<min) min=b;
        if(c<min) min=c;
        return min;
    }
}
