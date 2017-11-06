package easy;

/**
 * 203. Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 * Created by xkc on 8/21/16.
 */
public class Solution203_RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode cur = head, prev = fakeHead;
        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
            }else {
                prev = prev.next;
            }
            cur = cur.next;
        }

        return fakeHead.next;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
}
