package com.zhu;

public class 删除链表重复节点 {
    static public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null) return pHead;
        ListNode pre = null;
        ListNode re = null;
        ListNode curNode = pHead;
        while(curNode != null){
            ListNode nextNode = curNode.next;
            if(nextNode == null || nextNode.val != curNode.val){
                if(pre == null) re=curNode;
                else {
                    pre.next = curNode;
                }
                pre = curNode;
                curNode = curNode.next;
            }else{
                curNode = nextNode;
                while(curNode.next!=null && curNode.val==curNode.next.val){
                    curNode = curNode.next;
                }
                curNode=curNode.next;
            }
        }
        if(pre!=null)
            pre.next=null;
        return re;
    }


}
