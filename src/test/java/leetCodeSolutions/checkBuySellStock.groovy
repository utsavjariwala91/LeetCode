/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkBuySellStock
{
    /** Say you have an array for which the ith element is the price of a given stock on day i.
     * If you were only permitted to complete at most one transaction
     * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     * Example 1:
     * Input: [7, 1, 5, 3, 6, 4]
     * Output: 5
     * --> max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
     * Example 2:
     * Input: [7, 6, 4, 3, 1]
     * Output: 0
     * In this case, no transaction is done, i.e. max profit = 0 **/

    public static void main(String[] args)
    {
        int[] prices = [7,1,5,3,6,4]
        //int[] prices = [1,2]
        println(" ::: " +  maxProfit(prices))
    }
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int benifit = 0;
        int sellPrice = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            sellPrice = prices[i] - buyPrice;
            if(benifit < sellPrice){
                benifit = sellPrice;
            }
        }
        return benifit;
    }
}
