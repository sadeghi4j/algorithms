package algorithm.easy;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/11 - 6:38 PM
 */
public class _2_Palindrome {

    public static void main(String[] args) {
        boolean palindrome = new _2_Palindrome().isPalindrome(-121);
        System.out.println("palindrome = " + palindrome);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] chars = Integer.toString(x).toCharArray();
        int length = chars.length - 1;
        for (int i = 0; i <= length / 2; i++) {
            if (chars[i] != chars[length - i]) {
                return false;
            }
        }
        return true;
    }

}
