class Solution {
    public int maxProfit(int[] prices) {
        int maxpf = 0;
        int lspr = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            lspr = Math.min(lspr,prices[i]);
            int prf = prices[i]-lspr;
            maxpf = Math.max(prf,maxpf);
        }
        return maxpf;
    }
}