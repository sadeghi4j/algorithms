package algorithm.easy;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/23 - 10:20 PM
 */
public class _27RemoveAllOccurrencesOfVal {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{3, 2, 2, 3};
//        int removeElementCount = new _27RemoveAllOccurrencesOfVal().removeElement(nums, 3);
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int removeElementCount = new _27RemoveAllOccurrencesOfVal().removeElement(nums, 2);
        System.out.println("removeElementCount = " + removeElementCount);
    }
}
