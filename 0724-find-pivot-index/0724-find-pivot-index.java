class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int [n+1];
        prefix[0]=0;

        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        int left=0;
        for(int right=0;right<n;right++){
            if((prefix[right]-prefix[0])==(prefix[n]-prefix[right+1]))
                return right;
        }

        return -1;


    }
}
