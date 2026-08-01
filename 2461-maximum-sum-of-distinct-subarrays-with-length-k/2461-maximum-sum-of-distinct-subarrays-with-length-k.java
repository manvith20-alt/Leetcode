class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0,max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size() == k)
            max = sum;
        for(int j=k;j<n;j++){
            sum += nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum -= nums[j-k];
            map.put(nums[j-k],map.getOrDefault(nums[j-k],0)-1);
        
        if(map.get(nums[j-k])==0)
            map.remove(nums[j-k]);
        
        if(map.size()==k)
            max = Math.max(sum,max);
        }
        return max;
    }
}