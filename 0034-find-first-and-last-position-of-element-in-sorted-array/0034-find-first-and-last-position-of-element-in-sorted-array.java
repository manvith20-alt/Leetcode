class Solution {
    public int[] searchRange(int[] nums, int target) {

        int lower = lowerbond(nums,target);
        int upper = upperbond(nums,target);

         if (lower == nums.length || nums[lower] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lower, upper - 1};

    }


private int upperbond(int[] nums,int target){
        int left=0;
        int right=nums.length;

        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid]>target)
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }

private int lowerbond(int[] nums,int target){
        int left=0;
        int right=nums.length;

        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid]>=target)
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }
}