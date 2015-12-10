package medium;

/**
 * Add Two Numbers
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * Created by xkc on 7/29/15.
 */
public class Solution_2 {
    int sum = 0;
    int carry = 0;

    public static void main(String[] args) {

    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if (l1 == null || l2 == null){
//            if (carry == 0){
//                return null;
//            }
//            return new ListNode(1);
//        }else {
//            sum = (l1 == null?0:l1.val) + (l2 == null?0:l2.val) + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//        }
//
//        ListNode listNode = new ListNode(sum);
//        listNode.next = addTwoNumbers(l1.next == null?null:l1.next, l2.next == null?null:l2.next);
//
//        return listNode;
//    }


    /**
     * AC,不太懂～～～～
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curNode = null;
        ListNode prevNode = null;
        ListNode nodeHead = null;

        int carryOver = 0;
        boolean first = true; // keep track of head of the sumNode chain
        while (l1 != null || l2 != null) {

            int sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carryOver;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

            carryOver = sum / 10;
            sum = sum % 10;
            curNode = new ListNode(sum);

            if (first) {
                nodeHead = curNode;
                first = false;
            } else {
                prevNode.next = curNode;
            }
            prevNode = curNode;
        }
        if (carryOver > 0) {
            prevNode.next = new ListNode(carryOver);
        }
        return nodeHead;
    }



    /**
     * the time exceeded
     */
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//        ListNode curNode = null;
//        ListNode preNode = null;
//        ListNode newNode = null;
//        int carry = 0;
//        boolean isFirst = true;
//
//        while(l1 != null && l2 != null){
//            int sum = l1.val + l2.val + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//
//            l1 = l1.next;
//            l2 = l2.next;
//            curNode = new ListNode(sum);
//
//            if (isFirst){
//                newNode = curNode;
//                isFirst = false;
//            }else {
//                preNode.next = curNode;
//            }
//
//            preNode = curNode;
//
//        }
//        if (carry > 0){
//            if (l1 != null){
//                l1.val += carry;
//            }
//            if (l2 != null){
//                l2.val += carry;
//            }
//        }
//
//        while(l1 != null){
//            newNode.next = l1.next;
//        }
//        while (l2 != null){
//            newNode.next = l2.next;
//        }
//
//        return  newNode;
//    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
