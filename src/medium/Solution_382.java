package medium;

import java.util.Random;

/**
 *
 * Created by xkc on 8/30/16.
 *
 * Given a singly linked list, return a random node's value from the linked list.
 * Each node must have the same probability of being chosen.

 Follow up:
 What if the linked list is extremely large and its length is unknown to you?
 Could you solve this efficiently without using extra space?

 Example:

 // Init a singly linked list [1,2,3].
 ListNode head = new ListNode(1);
 head.next = new ListNode(2);
 head.next.next = new ListNode(3);
 Solution solution = new Solution(head);

 // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 solution.getRandom();
 */
public class Solution_382 {
    ListNode head = null;
    Random random = null;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution_382(ListNode head) {
        this.head = head;
        this.random = new Random();

    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode result = null;
        ListNode current = this.head;
        for (int i = 1; current != null; i ++){
            if (random.nextInt(i) == 0){
                result = current;
            }
            current = current.next;
        }
        return result.val;

    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
}
