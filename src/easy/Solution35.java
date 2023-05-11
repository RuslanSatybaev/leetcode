package easy;

import java.util.Arrays;

public class Solution35 {

    public int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                start = mid;
                break;
            }
        }
        return start;
    }


    public int searchInsert(int[] arr, int target) {
        int search = Arrays.binarySearch(arr, target);
        return search < 0 ? -(search + 1) : search;
    }

    public int searchInsert2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }
}
