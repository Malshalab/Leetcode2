class Solution {
    public int search(int[] nums, int target) {
        int result ;
        int l=0 ;
        int r=nums.length-1 ;


        while(r>=l){
            int m= (r+l)/2 ;
            if(target==nums[m]){
                return m ;
            }
            else if(target==nums[l]){
                return l ;
            }
            else if(nums[l]<=nums[m]){
                if(nums[l]<=target && target<=nums[m]){
                    r=m-1 ;
                }
                else{
                    l=m+1 ;
                }
                
            }
            else if(nums[r]>=nums[m]){
                if(nums[r]>=target && target>=nums[m]){
                    l=m+1 ;
                }
                else{
                    r=m-1 ;
                }
            }
            else{
                l=m+1 ;
            }

        }


        return -1 ;
    }
}
