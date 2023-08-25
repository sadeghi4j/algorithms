package algorithm;

import java.util.Arrays;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/08 - 10:39 PM
 */
public class MergeSortedArray {

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
//        new MergeSortedArray().merge(nums1, 3, nums2, 3);

//        int[] nums1 = {2, 5, 6, 0, 0, 0};
//        int[] nums2 = {1, 2, 3};
//        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        int[] nums1 = {1};
        int[] nums2 = {};
        new MergeSortedArray().merge(nums1, 1, nums2, 0);
        System.out.println("nums1 = " + Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = 0;
        int j = 0;
        int[] res = new int[nums1.length];
        while (i + j < m + n) {
            if (i >= m) {
                res[i + j] = nums2[j++];
            } else if (j >= n) {
                res[i + j] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                res[i + j] = nums1[i++];
            } else {
                res[i + j] = nums2[j++];
            }
        }
        System.arraycopy(res, 0, nums1, 0, nums1.length);
    }

}
