class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums) ;

        Set<List<Integer>> result = new HashSet<>() ;

        
        for(int i=0 ; i<nums.length-2; i++){
            int l=i+1 ;
            int r=nums.length -1 ;

        while (r>l){
            int sum=nums[l]+nums[r]+nums[i] ;
            if(sum==0){
                result.add(Arrays.asList(nums[l],nums[r],nums[i])) ;
            }

            if(sum>0){
                r-- ;
            }
            else{
                l++ ;
            }
            
        }
        }
        return new ArrayList<>(result) ;
    }
}
