class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(i<list.size()){
                nums[i]=list.get(i);
            }
            else{
                nums[i]=0;
            }
        }
    }
}
