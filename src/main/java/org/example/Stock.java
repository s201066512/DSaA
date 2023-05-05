package org.example;

import static org.example.Stock.Solution.maxProfit;
/*

* */
public class Stock {
    class Solution {
        public static int maxProfit(int[] prices) {
            int smallest = prices[0];
            int smallestIndex = 0;
            int largest = prices[0];
            int largestIndex = 0;
            // get value of smallest number
            for (int price : prices) {
                if (smallest > price) {
                    smallest = price;
                }
            }

            // find smallestIndex
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] == smallest) {
                    smallestIndex = i;
                    break;
                }
            }
            // find the largest number
            for (int price : prices) {
                if (largest < price) {
                    largest = price;
                }
            }

            // find largestIndex
            for (int j = 0; j < prices.length; j++) {
                if (prices[j] == largest) {
                    largestIndex = j;
                    break;
                }
            }
            if (smallestIndex > largestIndex){
                return largest-smallest;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
