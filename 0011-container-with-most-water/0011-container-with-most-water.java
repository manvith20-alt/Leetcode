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
            else if(height[low]>height[high]){
                val = height[high]*(high-low);
                high--;
            }
            else{
                val = height[low]*(high-low);
                low++;
            }
            max = Math.max(max,val);
        }
        return max;
    }
}