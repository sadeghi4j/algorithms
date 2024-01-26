package algorithm.easy;

import java.util.*;
import java.io.*;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/11/19 - 10:46 AM
 */
public class FindIntersection {


    public static String FindIntersection(String[] strArr) {
        String[] first = strArr[0].split(", ");
        String[] second = strArr[1].split(", ");
        List<String> result = new LinkedList<>();
        int i = 0, j = 0;

        while (i < first.length && j < second.length) {
            int num1 = Integer.parseInt(first[i]);
            int num2 = Integer.parseInt(second[j]);
            if (num1 == num2) {
                result.add(num1 + "");
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {

                j++;
            }
        }
        return String.join(",", result);
//        return strArr[0];
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String[] input = {"1, 3, 4, 7, 13",
                "1, 2, 4, 13, 15"};
        System.out.print(FindIntersection(input));
    }

}
