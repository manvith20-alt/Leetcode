class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<=n-1;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

