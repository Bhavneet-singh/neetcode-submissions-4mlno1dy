class Solution {
    public int maxProfit(int[] prices) {
        // 
        int profit = 0 ; 
        int min = 999  ; 

        // int left = 0 , right = 1 ;
        int n = prices.length ; 
        
        // while(right < n ) {
        //     //             System.out.println("left" +left) ; 
        //     //                                     System.out.println(" ") ; 


        //     // System.out.println("right" + right) ; 
        //     if(prices[left] < prices[right]){
        //         profit = Math.max(profit , (prices[right] - prices[left])) ; 
        //     }
        //     else{
        //         left = right  ; 
        //     }
        //     right ++  ;

        // }
        // return profit ; 
        
        for(int i : prices) {
            min = Math.min(min , i) ; 
            profit = Math.max(profit , i - min ) ; 
        }
        return profit ; 
        

        
    }
}
