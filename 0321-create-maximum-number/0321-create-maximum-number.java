class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];

        int start = Math.max(0, k - nums2.length);
        int end = Math.min(k, nums1.length);

        for (int i = start; i <= end; i++) {
            int[] a = maxSubsequence(nums1, i);
            int[] b = maxSubsequence(nums2, k - i);

            int[] merged = merge(a, b);

            if (greater(merged, 0, ans, 0)) {
                ans = merged;
            }
        }

        return ans;
    }

    private int[] maxSubsequence(int[] nums, int k) {
        int[] stack = new int[k];
        int top = 0;
        int remove = nums.length - k;

        for (int num : nums) {
            while (top > 0 && remove > 0
                    && stack[top - 1] < num) {
                top--;
                remove--;
            }

            if (top < k) {
                stack[top++] = num;
            } else {
                remove--;
            }
        }

        return stack;
    }

    private int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, r = 0;

        while (i < a.length || j < b.length) {
            if (greater(a, i, b, j)) {
                result[r++] = a[i++];
            } else {
                result[r++] = b[j++];
            }
        }

        return result;
    }

    private boolean greater(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length
                && a[i] == b[j]) {
            i++;
            j++;
        }

        if (j == b.length) {
            return true;
        }

        if (i == a.length) {
            return false;
        }

        return a[i] > b[j];
    }
}
