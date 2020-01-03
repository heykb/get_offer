package com.zhu;

public class 剪绳子 {

    public int cutRope(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        for(int i=4;i<=n;++i){
            arr[n]=0;
            //从1开始，要求至少剪一刀
            for(int j=1;j<=i/2;++j){
                int tmp = arr[j]*arr[i-j];
                if(arr[n]<tmp) arr[n] = tmp;
            }

        }
        return arr[n];

    }
}
