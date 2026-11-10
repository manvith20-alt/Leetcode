class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxpf = 0;
        int minpr = Integer.MAX_VALUE;
         
        for(int i=0;i<n;i++){
            minpr=Math.min(minpr,prices[i]);
            maxpf=Math.max(maxpf,prices[i]-minpr);
        }
        return maxpf;
    }
}