//! Leetcode 121
class Solution {
    public int maxProfit(int[] prices) {
        //  int n = prices.length;
        //  int max = n[0];
        // //  int maxIndex = 0;
        // for(int i = 0; i < n.length; i++){
        // //   int max =i;
        //  if(n[i] > max){
        //     // return max;
        //     max = n[i];
        //     // maxIndex = i ;
        //  }
        // }  

    int minPrice = prices[0];
    int maxProfit = 0 ;
    for(int i = 0 ; i < prices.length; i++){
    int currentPrice = prices[i];
     int potentialProfit = currentPrice - minPrice;
     maxProfit =Math.max(maxProfit ,potentialProfit);
     minPrice = Math.min(minPrice, currentPrice);
    }
    return maxProfit;
    }
}

//* Hareesh Solution
// class Solution {
//     public int maxProfit(int[] prices) {
//      int minPrice = prices[0];
//      int profit = 0 ;
//      for(int i=1; i<prices.length ; i++){
//         minPrice =  Math.min(minPrice, prices[i]);
//         profit = Math.max(profit,prices[i] - minPrice);
//      }
//      return profit;

//     }
// }

//* I try to Do like this  but cannot able to do it
// class Solution {
//     public int maxProfit(int[] prices) {
//         int buy = prices[0];
//         int profit = 0;
//         for (int i = 1; i < prices.length; i++) {
//             if (prices[i] < buy) {
//                 buy = prices[i];
//             } else if (prices[i] - buy > profit) {
//                 profit = prices[i] - buy;
//             }
//         }
//         return profit;
//     }
// }

