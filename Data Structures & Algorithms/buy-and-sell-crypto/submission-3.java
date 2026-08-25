class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int l =0;
        int r=l+1;
        while(r < prices.length){
            if(l == prices.length-1){
                break;
            }
            if(prices[l] > prices[r]){
              l = r;
            }
            else{
                int curr = prices[r] - prices[l];
                profit = Math.max(profit,curr);
            }
            r++;
        }
        
        return profit;
    }
}
