package algorithm.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * Solution 1 (BruteForce) just checks all possibilities by using nested for loop
 * Solution 2 (TwoPass) make an improvement by storing the nums and their indexes in Map and find accomplishment from Map by using hash
 * روش اول حل مسئله بوسیله بررسی تمام احتمالات هست
 * روش دوم از آیتم های قبلی رو میریزه تو یه جور حافظه موقت و آیتم فعلی رو بوسیه مپ به تمامشون مقایسه می کنه
 * @author Ali Sadeghi
 * Created at 2023/08/11 - 5:08 PM
 */
public class _1TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

//        int[] nums = {3,2,4};
//        int target = 6;

//        int[] nums = {3,3};
//        int target = 6;
        int[] ints = new _1TwoSum().twoSumOnePass(nums, target);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    public int[] twoSumOnePass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer change = map.get(target - num);
            if (change != null) { //map.containsKey(target - num)
                return new int[]{change, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public int[] twoSumTwoPass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer change = map.get(target - num);
            if (change != null && i != change) { //map.containsKey(target - num)
                return new int[]{i, change};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
