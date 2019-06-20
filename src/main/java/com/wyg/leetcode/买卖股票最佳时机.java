package com.wyg.leetcode;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
 */
public class 买卖股票最佳时机 {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        CommonUtils.printArr(arr);
        int size = maxProfit(arr);
        System.out.println(size);

        CommonUtils.printArr(arr);

    }
    public static int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int buyPrice = 0;
        int totalProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (buyPrice == 0) {
                if (prices[i] < prices[i + 1]) {
                    buyPrice = prices[i];
                    totalProfit += (prices[i + 1] - prices[i]);
                }
            }else {
                if (prices[i] <= prices[i + 1]) {
                    totalProfit += (prices[i + 1] - prices[i]);
                } else {
                    buyPrice = prices[i + 1];
                }

            }
        }
        return totalProfit;
    }
}
