package algorithm.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/11/19 - 12:29 PM
 */
public class _3LengthOfLongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ans = 0;
        Set<Character> chars = new HashSet<>();
        while(j < s.length()) {
            char ch = s.charAt(j);
            if (!chars.contains(ch)) {
                chars.add(ch);
                j++;
                ans = Math.max(ans, chars.size());
            } else {
                chars.remove(s.charAt(i));
                i++;
            }

        }
        return ans;
    }

    /*public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        List<Character> chars = new LinkedList<>();
        while(j < s.length()) {
            char ch = s.charAt(j);
            if (!chars.contains(ch)) {
                chars.add(ch);
                j++;
            } else {
                chars.remove(i);
                i++;
//                String maxString = s.substring(i, j - i + 1);
            }

        }
        return j - i;
    }*/

    public static void main(String[] args) {
        String s = "abcabcbb";
//        String s = "bbbbb";
//        String s = "pwwkew";
        int length = new _3LengthOfLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        System.out.println("length = " + length);
    }
}
