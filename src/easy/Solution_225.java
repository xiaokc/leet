package easy;

import java.util.LinkedList;

/**
 * Created by xkc on 3/9/16.
 */
public class Solution_225 {
    class MyStack {
        LinkedList<Integer> head = new LinkedList<>();
        LinkedList<Integer> tail = new LinkedList<>();

        // Push element x onto stack.
        public void push(int x) {
            head.push(x);
        }

        // Removes the element on top of the stack.
        public void pop() {
            top();
            head.pop();
        }

        // Get the top element.
        public int top() {
            if (tail.isEmpty()) {
                for (int i = 0; i < head.size() - 1; i ++){
                    tail.push(head.pop());
                }
                for (int i = 0; i < tail.size(); i ++){
                    head.push(tail.pop());
                }

            }

            return head.peek();

        }

        // Return whether the stack is empty.
        public boolean empty() {
            return head.isEmpty() && tail.isEmpty();
        }
    }
}
