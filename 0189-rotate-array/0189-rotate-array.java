class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] arr = Arrays.copyOf(nums, nums.length);
        int j=0;
        int count=0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[j] = arr[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            nums[j]=arr[i];
            if(j<nums.length)
                j++;
        }

    }
}