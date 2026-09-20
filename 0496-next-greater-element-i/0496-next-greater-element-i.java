class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = solve(nums1[i],nums2);
        }

        return arr;
    }
    private int solve(int elem, int[]nums2){
        int l =nums2.length;
        int j=0;
        for(int i=0;i<l;i++){
            j=i;
            if(nums2[i]==elem && i<l-1){
                while(j+1<l && nums2[j+1]<=elem){
                    j++;
                }
                if(j+1<l)
                    return nums2[j+1];
            }
        }
        return -1;
    }
}