class Solution {
    public int maxProfit(int[] prices) {
        int result =0 ;
        int l=0;
        int r=1 ;
        int diff ;
        while(r<(prices.length)){
            diff=prices[r]-prices[l] ;
            result=Math.max(result, diff) ;
            if(prices[r]<prices[l]){
                l=r ;
                r++ ;
            }
            else if(prices[r]>prices[l]){
                r+=1 ;
            }
            else{
                l=r ;
                r++ ;
            }
        }

        return result ;
    }
}


// iterate through the array if the left>right then move the left and the right
// if the right is greater than the left cool then we note down this value and increment the right
// we end the while loop when the left=length of prices -1
