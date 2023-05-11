package easy;

import java.util.Arrays;

public class Solution26 {

    public int removeDuplicates(int[] nums) {
        int[] ints = Arrays.stream(nums).distinct().sorted().toArray();
        System.arraycopy(ints, 0, nums, 0, ints.length);
        return ints.length;
    }
}
