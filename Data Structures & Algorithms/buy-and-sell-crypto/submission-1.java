class Solution {
    public int maxProfit(int[] prices) {
        // int max = 0;
        // int n = prices.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         max = Math.max(max,(prices[j] - prices[i]));
        //     }
        // }
        // return max;
        int left = 0 , right = 1 ; 
        int n = prices.length ; 
        int max = 0 ; 

        while(right < n ) {
            if(prices[left] < prices[right]){
                max = Math.max(max , prices[right] - prices[left]) ; 

            }
            else {
                left = right ; 
            }
            right++ ; 
        }
        return max ; 
    }
}