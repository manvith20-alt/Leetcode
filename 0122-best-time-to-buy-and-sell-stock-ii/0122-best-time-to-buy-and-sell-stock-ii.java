class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxpf = 0;
        int minpr = Integer.MAX_VALUE;
        int total =0;

        for(int i=0;i<n;i++){
            minpr = Math.min(minpr,prices[i]);
            if(prices[i]-minpr>0){
                total += prices[i]-minpr;
                minpr = prices[i];
            }
        }
        return total;
    }
}