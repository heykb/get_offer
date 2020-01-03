package com.zhu;

public class 整数次方 {
    public double Power(double base, int exponent) {

        if(exponent<0) {
            return 1/PowerWithUnsigned(base,-exponent);
        }else
            return PowerWithUnsigned(base,exponent);

    }
    double PowerWithUnsigned(double base, int exponent){
        if(exponent==0) return 1;
        if(exponent==1) return base;
        double re = 1;
        if((exponent&1) == 1)
            re = base;

        return re*PowerWithUnsigned(base,exponent/2)*PowerWithUnsigned(base,exponent/2);
    }
}
