class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;
        int prefix = 0;

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
                prefix = 0;
            }
            while (map.get(nums[left]) > 1) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
                prefix++;
            }

            if (map.size() == k) {
                count += prefix + 1;
            }
        }

        return count;
    }
}