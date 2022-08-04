package s;

import util.ListNode;

public class J002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curNode = new ListNode();
        dummy.next = curNode;
        int inc = 0;
        do{
            int cur = inc;
            if(l1!=null) {
                cur += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                cur += l2.val;
                l2 = l2.next;
            }
            inc = cur / 10;
            cur = cur % 10;
            curNode.val = cur;
            if(l1==null&&l2==null&&inc==0) break;
            ListNode newNode = new ListNode();
            curNode.next = newNode;
            curNode = newNode;
        }while(true);
        return dummy.next;
    }
}
