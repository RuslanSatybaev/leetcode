package easy;

import java.util.Arrays;

public class Solution27 {

    public int removeElement1(int[] nums, int val) {
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == val) {
                nums[insertIndex] = nums[i];
            }
        }
        return nums.length;
    }

    public int removeElement2(int[] nums, int val) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                nums[i] = nums[i + 1];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public int removeElement(int[] nums, int val) {
        int[] ints = Arrays.stream(nums).filter(s -> s != val).toArray();
        System.arraycopy(ints, 0, nums, 0, ints.length);
        return ints.length;
    }
}
