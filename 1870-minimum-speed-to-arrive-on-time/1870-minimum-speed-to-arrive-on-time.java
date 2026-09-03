class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=10000000;
         if (hour <= dist.length - 1) {
            return -1;
        }

        while(low<high){
            int mid = low + (high-low)/2;
            if(possible(mid,hour,dist)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    private boolean possible(int mid,double hour,int[] dist){
        double h=0;
        for(int i=0;i<dist.length-1;i++){
            h += (dist[i]+mid-1)/mid;
        }
        h += (double)dist[dist.length - 1]/mid;

        if(h<=hour)return true;

        return false;
    }
}