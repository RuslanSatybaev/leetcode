package easy;

import java.util.Arrays;

public class Solution1480 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(new Solution1480().runningSum(array)));
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
