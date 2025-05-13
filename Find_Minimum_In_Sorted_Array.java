class Solution {
    public int findMin(int[] nums) {
        
        int left=0 ;
        int right=nums.length-1 ;
        int minimum=5001 ;

        while(left<=right){

            if (nums[left] < nums[right]) {
                minimum = Math.min(minimum, nums[left]);
                break;
            }

            int middle=(right+left)/2 ;
            minimum=Math.min(nums[middle],minimum) ;
            if(nums[middle]>=nums[left]){
                left=middle+1;
            }
            else{
                right=middle-1 ;
            }
            
        }
        return minimum ;
    }
}
