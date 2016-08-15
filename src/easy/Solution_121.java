package easy;

/**
 * Best time to buy and sell stock
 * Created by xkc on 8/3/16.
 */
public class Solution_121 {
    public static void main(String[] args){
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 0){
            return 0;
        }

        int profit = 0;
        int sell = prices[0];
        for (int i = 0; i < prices.length; i ++){
            if (prices[i] < sell){
                sell = prices[i];
            }else {
                if (prices[i] - sell > profit){
                    profit = prices[i] - sell;
                }
            }
        }
        return profit;
    }
}
