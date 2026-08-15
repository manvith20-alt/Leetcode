class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int curMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int curMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {

            // Normal Kadane
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            // Minimum Kadane
            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);

            total += num;
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}