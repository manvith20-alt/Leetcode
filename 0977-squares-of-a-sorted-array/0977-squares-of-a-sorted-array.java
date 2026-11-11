class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int [n];

        int left=0;
        int right=n-1;
        for(int k=n-1;k>=0;k--){
            int a = nums[left]*nums[left];
            int b = nums[right]*nums[right];
            if(a<b){
                arr[k]=b;
                right--;
            }
            else{
                arr[k]=a;
                left++;
            }
        }
        return arr;
    }
}