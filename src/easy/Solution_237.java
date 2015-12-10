package easy;

import java.util.LinkedList;

/**
 * Delete Node in a Linked List
 * Created by xkc on 7/27/15.
 */
public class Solution_237 {
    static LinkedList<ListNode> listNodes;

    public static void main(String[] args) {
        listNodes = new LinkedList<>();
        ListNode node = new ListNode(0);
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        node.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = null;

        listNodes.add(node);
        listNodes.add(node_1);
        listNodes.add(node_2);
        listNodes.add(node_3);
        listNodes.add(node_4);

        method(node_3);

//        for (int i = 0; i < listNodes.size(); i++) {
//            System.out.println(listNodes.get(i).val);
//        }


        System.out.println(node.val);
        System.out.println(node_1.val);
        System.out.println(node_2.val);
        System.out.println(node_3.val);
        System.out.println(node_4.val);

    }

    public static void deleteNode(ListNode node) {
        LinkedList<ListNode> listNodes = new LinkedList<>();
        for (int i = 0; i < listNodes.size(); i++) {
            if (listNodes.get(i).val == node.val){//找到删除的结点
                listNodes.get(i-1).next = node.next;
                listNodes.remove(i);
            }
        }

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static void method(ListNode node){
        if (node.next == null){
            node = null;
        }else if (node != null){
            node.val = node.next.val;
            node.next  = node.next.next;
        }
    }

}
