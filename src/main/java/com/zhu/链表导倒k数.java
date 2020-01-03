package com.zhu;

public class 链表导倒k数 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k<1) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        while(--k > 0){
            p1=p1.next;
            if(p1==null) return null;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
