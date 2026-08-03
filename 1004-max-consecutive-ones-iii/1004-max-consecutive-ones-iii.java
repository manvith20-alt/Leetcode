class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int right =0;
        int max = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            if(zeros>k){
                if(nums[left]==0)
                    zeros--;
                left++;
            }
        }

        return right-left;
    }
}