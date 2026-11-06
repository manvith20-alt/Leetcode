class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        double val=0;
        int arr[] = new int[n1+n2];
        int j=0;
        for(int i=0;i<n1;i++){
            arr[j]=nums1[i];
            j++;
        }
        for(int i=0;i<n2;i++){
            arr[j]=nums2[i];
            j++;
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int n = arr.length/2;
            val = ((double) arr[n] + arr[n-1]) / 2;
        }
        else{
            val = arr[(arr.length)/2];
        }
        return val;
    }
}