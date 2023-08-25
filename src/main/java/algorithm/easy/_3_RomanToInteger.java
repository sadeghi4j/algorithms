package algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/11 - 10:04 PM
 */
public class _3_RomanToInteger {

    public static void main(String[] args) {
//        String roman = "VIII";
//        String roman = "LVIII";
        String roman = "MCMXCIV";
        int romanToInt = new _3_RomanToInteger().romanToInt(roman);
        System.out.println("romanToInt = " + romanToInt);
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && map.get(chars[i]) < map.get(chars[i + 1])) {
                sum -= map.get(chars[i]);
            } else {
                sum += map.get(chars[i]);
            }
        }
        return sum;
    }

    public int romanToInt2(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int x = parseChar(s.charAt(i));
            if (4 * x < sum) {
                sum -= x;
            } else {
                sum += x;
            }
        }
        return sum;
    }

    private int parseChar(char aChar) {
        return switch (aChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException();
        };
    }
}
