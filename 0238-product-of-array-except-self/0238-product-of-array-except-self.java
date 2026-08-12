class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix=1;
        int post=1;
        int[] ans = new int[n];
        int[] back = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            prefix *= nums[i];
            if(nums[i]!=0)
                post *= nums[i];
        }
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                if(map.get(nums[j])>=2)
                    return back;
                else
                    ans[j]=post;
            }
            else
                ans[j]=prefix/nums[j];
        }
    return ans;
    }
}