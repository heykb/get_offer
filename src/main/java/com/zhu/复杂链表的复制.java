package com.zhu;

import java.util.HashMap;

public class 复杂链表的复制 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode reHead = new RandomListNode(pHead.label);;
        map.put(pHead,reHead);
        RandomListNode cur = pHead.next;
        RandomListNode rePre = reHead;
        while(cur != null){
            RandomListNode tmp = new RandomListNode(cur.label);
            rePre.next = tmp;
            map.put(cur,tmp);
            cur=cur.next;
            rePre = tmp;
        }
        cur=pHead;
        RandomListNode reCur = reHead;
        while(cur!=null){
            if(cur.random != null) reCur.random = map.get(cur.random);
            cur = cur.next;
            reCur = reCur.next;
        }
        return reHead;
    }
    public RandomListNode Clone1(RandomListNode pHead)
    {
        if(pHead==null) return null;
        RandomListNode cur = pHead;
        while(cur!=null){
            RandomListNode tmp = new RandomListNode(cur.label);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        cur = pHead;
        while(cur!=null){
            RandomListNode ramdom = cur.random;
            if(ramdom!=null){
                cur.next.random = ramdom.next;
            }
            cur = cur.next;
            if(cur!=null) cur=cur.next;
        }

        RandomListNode reHead = pHead.next;
        cur = pHead;
        RandomListNode reCur = reHead;
        while(reCur!=null){
            cur.next = reCur.next;
            cur = cur.next;
            if(cur!=null)
                reCur.next = cur.next;
            reCur = reCur.next;
        }

        return reHead;
    }
}
