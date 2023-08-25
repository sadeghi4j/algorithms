package algorithm.easy;

import java.util.Stack;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/12 - 10:04 PM
 */
public class _20ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        String s = "()";
        String s =  "()[]{}";
//        String s =  "(]";
        boolean valid = new _20ValidParentheses().isValid(s);
        System.out.println("valid = " + valid);
    }
}
