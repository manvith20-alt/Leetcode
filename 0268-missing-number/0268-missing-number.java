class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tot = n*(n+1)/2;

        for(int i:nums){
            tot -= i;
        }
        return tot;
    }
}