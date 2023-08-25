package algorithm.easy;

import java.util.Arrays;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/23 - 10:02 PM
 */
public class _26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int low = 0;
        for (int up = 1; up < nums.length; up++) {
            if (nums[low] != nums[up]) {
                low++;
                nums[low] = nums[up];
            }
        }
        return low + 1;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int removeDuplicates = new _26RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.out.println("removeDuplicates = " + removeDuplicates);
        System.out.println("removeDuplicates = " + Arrays.toString(Arrays.copyOf(nums, removeDuplicates)));
    }
}
