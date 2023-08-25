package algorithm.easy;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/24 - 12:58 AM
 */
public class _28FirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (j == needle.length()) {
                return i - j;
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return j;
    }

    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        int str = new _28FirstOccurrenceInString().strStr(haystack, needle);
        System.out.println("str = " + str);
    }
}
