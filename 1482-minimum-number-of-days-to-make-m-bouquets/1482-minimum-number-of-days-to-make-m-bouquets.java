class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int b: bloomDay){
            low = Math.min(low,b);
            high = Math.max(high,b);
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(cancreate(mid,k,m,bloomDay)){
                high = mid-1;
            }
            else{
                low=mid+1;
            } 
        }
        return low;
    }

    private boolean cancreate(int day,int k,int m,int[] bloomDay){
        int flower=0;
        int bouque=0;

        for(int bloom : bloomDay){
            if(bloom<=day){
                flower++;
                if(flower==k){
                    bouque++;
                    flower=0;
                }
            }
            else{
                flower=0;
            }
        }
        return bouque>=m;
    }
}