package com.zhu;

public class 正则表达式 {
    public boolean match(char[] str, char[] pattern)
    {

        return matchCore(str,0,pattern,0);
    }
    public boolean matchCore(char[] str, int strIndex,char[] pattern,int patternIndex){

        //有效性检验：str到尾，pattern到尾，匹配成功
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        //pattern先到尾，匹配失败
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }
        //模式第2个是*，且字符串第1个跟模式第1个匹配,分3种匹配模式；如不匹配，模式后移2位
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
                return matchCore(str, strIndex, pattern, patternIndex + 2)//忽略X*,保留字符用于后面的匹配
                        || matchCore(str, strIndex + 1, pattern, patternIndex + 2)//视忽略X*,不保留字符
                        || matchCore(str, strIndex + 1, pattern, patternIndex);//保留匹配匹配下一个字符。
            } else {
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }
        //模式第2个不是*，且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
        if (( pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.' )&& strIndex != str.length) {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }
}
