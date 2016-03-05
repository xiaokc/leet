package easy;

/**
 * Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * Created by xkc on 3/3/16.
 */
public class Solution_21 {

    //time limit exceeded
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1;

        while (l1!= null && l2 != null) {
            head = l1.val < l2.val ? l1 : l2;
            head.val = l1.val < l2.val ? l1.val : l2.val;
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;

        }

        while (l1 != null) {
            head = l1;
            l1 = l1.next;
            head = head.next;
        }

        while (l2 != null) {
            head.next = l2;
            l2 = l2.next;
            head = head.next;
        }

        return head;

    }

    //递归方法，AC
    public ListNode method(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = method(l1.next, l2);
            return l1;
        }else {
            l2.next = method(l1, l2.next);
            return l2;
        }

    }


    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
