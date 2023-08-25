package algorithm.easy;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/24 - 12:58 AM
 */
public class _28FirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int n = 0;
        int h = 0;
        while (h < haystack.length() && n < needle.length()) {
            if (haystack.charAt(h) == needle.charAt(n)) {
                n++;
            } else {
                h = h - n;
                n = 0;
            }
            h++;
        }
        return n == needle.length() ? h - n : -1;
    }

    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad";
//        String haystack = "leetcode", needle = "leeto";
//        String haystack = "cocode", needle = "code";
        String haystack = "mississippi", needle = "issip";
        int str = new _28FirstOccurrenceInString().strStr(haystack, needle);
        System.out.println("str = " + str);
    }
}
