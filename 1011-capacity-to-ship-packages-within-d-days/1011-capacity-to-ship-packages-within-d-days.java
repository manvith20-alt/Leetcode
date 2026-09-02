class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0;
        int high = 0;
        for(int w : weights){
            low = Math.max(low,w);
            high += w;
        }
    
        int ans = 0;

        while(low<=high){
            int cap = low + (high-low)/2;

            if (possible(cap, weights, days)) {
                ans = cap;
                high = cap-1;
            }
            else{
                low = cap+1;
            }
        }
        return ans;
    }

    private boolean possible(int cap, int[] weights,int days){
        int sum=0;
        int day=1;

        for(int w:weights){
            sum += w;
            if(sum>cap){
                sum=w;
                day++;
            }
        }
        if(day<=days) return true;

        return false;
    }
}