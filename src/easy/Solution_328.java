package easy;

import java.util.LinkedList;

/**
 * Created by xkc on 2/25/16.
 */
public class Solution_328 {
    public static ListNode oddEvenList(ListNode head) {
       if (head != null){
           ListNode odd = head;
           ListNode even = head.next;
           ListNode evenHead = even;

           while (even != null && even.next != null){
               odd.next = odd.next.next;
               even.next = even.next.next;
               odd = odd.next;
               even = even.next;

           }
           odd.next = evenHead;
       }

        return head;

    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
