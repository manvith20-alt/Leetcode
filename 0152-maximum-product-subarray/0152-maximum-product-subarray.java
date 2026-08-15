class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=-10;

        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                maxpro=Math.max(maxpro,prod);
            }
        }
        return maxpro;
    }
}