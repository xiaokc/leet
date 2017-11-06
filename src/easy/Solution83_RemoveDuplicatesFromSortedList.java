package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xkc on 2/25/16.
 * Remove Duplicates from Sorted List
 */
public class Solution83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        List<ListNode> listNodes = new LinkedList<>();
        if (head != null) {
            ListNode node = head;
            while (node != null) {
                if (!listNodes.contains(node)) {
                    listNodes.add(node);
                }

                node = node.next;
            }


            for (int i = 0; i < listNodes.size(); i++) {
                head.next = listNodes.get(i);
            }

        }


        return head;
    }


    public ListNode commonMethod(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }

    public ListNode recurviseMethod(ListNode head) {
        if (head == null || head.next == null)
            return head;
        head.next = recurviseMethod(head.next);
        return head.val == head.next.val ? head.next : head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}


