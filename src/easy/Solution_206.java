package easy;

/**
 * Reverse Linked List
 * 单链表逆置
 * Created by xkc on 1/4/16.
 */
public class Solution_206 {
    public static ListNode reverseList(ListNode head) {
      if (head == null || head.next == null){
          return head;
      }
        ListNode curr = null;
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null){
            prev = curr;
            curr = temp;
            temp = curr.next;
            curr.next = prev;
        }
        return curr;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
