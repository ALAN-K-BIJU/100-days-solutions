class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findStartPosition(nums, target);
        if (result[0] != -1) {
            result[1] = findEndPosition(nums, target);
        }
        return result;
    }
    private int findStartPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start < nums.length && nums[start] == target) {
            return start;
        }
        return -1;
    }
    private int findEndPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
