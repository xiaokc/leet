package easy;

/**
 * 24. Swap Nodes in Pairs
 Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space.
 You may not modify the values in the list, only nodes itself can be changed.
 * Created by xkc on 8/21/16.
 */
public class Solution24_SwapNodesInPairs {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode head = swapPairs(node1);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;

    }
    static  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
}


