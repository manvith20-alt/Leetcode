class Solution {
    public void rotate(int[] nums, int k) {
    int j=nums.length-1;
    int i=0;
    k=k%nums.length;
    while(i<j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;
        j--;
    }
    i=0;
    j=k-1;
    while(i<j){
          int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;
        j--;
    }
    i=k;
    j=nums.length-1;
    while(i<j){
          int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;
        j--;
    }
    
       

    }
}