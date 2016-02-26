package medium;

/**
 * 单链表从m到n反转
 * Created by xkc on 1/7/16.
 */
public class Solution_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode mNode = head;
        ListNode nNode = head;
        for (int i = 1; i <= m; i ++){
             mNode = mNode.next;
        }
        for (int i = 1; i <= n; i ++){
            nNode = nNode.next;
        }

        ListNode temp = mNode;
        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode prev = null;
        while (temp != nNode){
            prev = curr;
            curr = temp;
            temp = curr.next;
            curr.next = prev;
        }

        return head;
    }
     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
