class Solution {
    public int splitArray(int[] nums, int k) {
        
       if (nums.length < k)
            return -1;

        long low = 0;
        long high = 0;

        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canAllocate(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    private static boolean canAllocate(int[] arr, int k, long mid) {

        int count = 1;
        long pagesum = 0;

        for (int page : arr) {

            if (pagesum + page <= mid) {
                pagesum += page;
            } else {
                count++;
                pagesum = page;
            }
        }

        return count <= k;
    }
}