package com.arjun.interviewprep;

public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i++){
            int sell = prices[i];
            if(buy < sell){
                int profit = sell - buy;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            else
            {
               buy = sell;
            }
        }
        return maxProfit;
    }
}
