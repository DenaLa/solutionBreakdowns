class StockBuyAndSellA {
    public int maximumProfit(int prices[]) {
        // code here
        int totalProfit = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                totalProfit = totalProfit + (prices[i] - prices[i-1]);
            }
        }
        
        return totalProfit;
    }
}
