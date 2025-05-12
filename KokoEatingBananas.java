class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int right = Arrays.stream(piles).max().getAsInt();
        int left=1 ;
        int res=right ;

        while(right>=left){
            int middle=(right+left)/2 ;
            double totalEatTime=0 ;
            for (int p:piles){
                totalEatTime+=Math.ceil((double)p/middle) ;
            }
            if(totalEatTime<=h){
                res=middle ;
                right=middle -1 ;
            }
            else{
                left=middle+1 ;
            }

        }
        return res ;

    }
}

// create an int array from  value of piles.length->max value of the integer array
// do binary search on this array to find the value
// we take the cieling of the value of the pile divded by the searched value 
// if all of the of the divided values add up to h then return this searched value
