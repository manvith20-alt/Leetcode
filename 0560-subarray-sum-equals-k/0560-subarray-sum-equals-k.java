class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefixsum=0;
        int count=0;
        int target=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int right=0; right<n;right++){
            prefixsum += nums[right];
            target = prefixsum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);

        }
      return count;
    }
}