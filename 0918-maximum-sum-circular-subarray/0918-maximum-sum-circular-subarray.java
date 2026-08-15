class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int curmax=0;
        int minsum=Integer.MAX_VALUE;
        int curmin=0;
        int total=0;

       for (int num : nums) {
    curmax = Math.max(num, curmax + num);
    maxsum = Math.max(maxsum, curmax);

    curmin = Math.min(num, curmin + num);
    minsum = Math.min(minsum, curmin);

    total += num;
}

        if(maxsum<0)
            return maxsum;

        int answer = total - minsum;
        return Math.max(answer,maxsum);
    }
}