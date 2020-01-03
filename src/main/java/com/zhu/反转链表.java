package com.zhu;

public class 反转链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode ReverseList(ListNode head) {
            if (head == null) return null;
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = head.next;
            while (next != null) {
                cur.next = pre;
                pre = cur;
                cur = next;
                next = next.next;

            }
            cur.next = pre;
            return cur;
        }
    }
}
