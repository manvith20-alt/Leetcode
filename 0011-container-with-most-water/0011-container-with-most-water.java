class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int s = n-1;
        int max=0;
        int i=0,j=n-1;
        while(i<j){
            if(height[i]<height[j]){
                max=(max > (height[i]*s))?max:height[i]*s;
                i++;
                s--;
            }
            else{
                 max=(max > (height[j]*s))?max:height[j]*s;
                 j--;
                 s--;
            }
        }  
        return max;  
        }
}