class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Find first index where nums[index] >= 0
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        int negativeCount = lo;

        // Find first index where nums[index] > 0
        lo = 0;
        hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] <= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        int positiveCount = n - lo;

        return Math.max(negativeCount, positiveCount);
    }
}