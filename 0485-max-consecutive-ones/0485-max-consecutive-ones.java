class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1)
                cons += 1;
            else
                cons=0;
            max=Math.max(max,cons);
        }
        return max;
    }
}