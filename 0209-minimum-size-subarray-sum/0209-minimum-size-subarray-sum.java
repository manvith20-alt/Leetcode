class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int right=0;
        int left=0;
        int sum=0;
        int ans=0;
        int min=n+1;
        for(right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                ans=right-left+1;
                min=Math.min(min,ans);
                sum-=nums[left];
                left++;
            }
        }
        if(min==n+1)
            return 0;
        return min;
    }
}