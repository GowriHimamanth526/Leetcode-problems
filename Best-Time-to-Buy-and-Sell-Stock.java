1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int minPrice = Integer.MAX_VALUE;
5        int maxProfit = 0;
6
7        for (int i = 0; i < prices.length; i++) {
8            
9            if (prices[i] < minPrice) {
10                minPrice = prices[i];   // update minimum price
11            }
12            else if (prices[i] - minPrice > maxProfit) {
13                maxProfit = prices[i] - minPrice; // update maximum profit
14            }
15        }
16
17        return maxProfit;
18    }
19}