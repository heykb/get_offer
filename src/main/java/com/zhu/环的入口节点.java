package com.zhu;

public class 环的入口节点 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null) return null;
        //是否有环
        ListNode quickP = pHead;
        ListNode slowP = pHead;
        while(quickP != null){
            quickP = quickP.next;
            if(quickP!=null) quickP = quickP.next;
            slowP = slowP.next;
            if(slowP==quickP) break;
        }
        if(slowP== quickP &&  quickP!= null){
            //找环的长度
            int circleLength = 1;
            ListNode meetNode = quickP;
            while(quickP.next!=meetNode){
                circleLength++;
                quickP = quickP.next;
            }

            quickP = pHead;
            slowP = pHead;
            for(int i=0;i<circleLength;i++){
                quickP = quickP.next;
            }
            while(quickP!=slowP){
                quickP=quickP.next;
                slowP = slowP.next;
            }
            return quickP;

        }else return null;
    }
}
