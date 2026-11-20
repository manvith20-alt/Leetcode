class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int len = 0;
        int[] prefix = new int [n];
        map.put(0, -1);
        
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }

        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i]= prefix[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(prefix[i])){
                len = Math.max(len,i-map.get(prefix[i]));
            }
            else{
                map.put(prefix[i],i);
            }
        }
        return len;
    }
}