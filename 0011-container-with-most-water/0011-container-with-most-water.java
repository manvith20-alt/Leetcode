class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int low=0;
        int high=n;
        int val=0;
        int max=0;
        while(low<high){
            if(height[low]<height[high]){
                val = height[low]*(high-low);
                low++;
            }
            else{
                val = height[high]*(high-low);
                high--;
            }
            
            max = Math.max(max,val);
        }
        return max;
    }
}