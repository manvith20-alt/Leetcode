class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=nums[0];
        int curmax=0;
        int minsum=nums[0];
        int curmin=0;

        for(int i=0;i<nums.length;i++){
            curmax=Math.max(nums[i],curmax+nums[i]);
            maxsum=Math.max(curmax,maxsum);

            curmin=Math.min(nums[i],curmin+nums[i]);
            minsum=Math.min(curmin,minsum);
        }

        return Math.max(maxsum,minsum*-1);
    }
}