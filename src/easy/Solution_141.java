package easy;

/**
 * Linked List cycle
 * Created by xkc on 8/3/16.
 */
public class Solution_141 {

    public  boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            head = head.next;

            if (fast == head){
                return true;
            }
        }
        return false;

    }

}


 // Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
