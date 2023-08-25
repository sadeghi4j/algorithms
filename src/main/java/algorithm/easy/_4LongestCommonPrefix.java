package algorithm.easy;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/11 - 10:34 PM
 */
public class _4LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int str0Length = strs[0].length();
        for (int i = 0; i < str0Length; i++) {
            char lastChar = strs[0].charAt(i);
            int strsLength = strs.length;
            for (int j = 1; j < strsLength; j++) {
                if (i == strs[j].length() || lastChar != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(lastChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog", "racecar", "car"};
//        String[] strs = {"ab", "a"};
        String longestCommonPrefix = new _4LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println("longestCommonPrefix = " + longestCommonPrefix);
    }
}
