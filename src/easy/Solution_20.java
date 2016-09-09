package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses  QuestionEditorial Solution  My Submissions
 Total Accepted: 128439
 Total Submissions: 418224
 Difficulty: Easy
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


 * Created by xkc on 9/3/16.
 */
public class Solution_20 {

    public static void main(String[] args){
        System.out.println(isValid("(){[]()}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == '(' || s.charAt(i) =='[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }

            else if (s.charAt(i) == ')' && ! stack.empty() && stack.peek() == '('){
                stack.pop();
            }

            else if (s.charAt(i) == ']' && ! stack.empty() && stack.peek() == '['){
                stack.pop();
            }
            else if (s.charAt(i) == '}' && ! stack.empty() && stack.peek() == '{'){
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.empty();

    }


}
