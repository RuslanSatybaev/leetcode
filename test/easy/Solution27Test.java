package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution27Test {

    @Test
    public void removeElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(2, new Solution27().removeElement(nums, 3));
        assertEquals(5, new Solution27().removeElement(nums2, 2));
    }
}