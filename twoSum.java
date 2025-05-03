class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>() ;

        for (int i=0 ; i<nums.length ; i++){
            int complement= target-nums[i] ;

            if(map.containsKey(complement)){
                int value=map.get(complement) ;
                int[] result={value, i} ;
                return result ;
            }
            
            if (map.get(nums[i])==null){
                map.put(nums[i], i) ;
            }


        }
        return null ;
    }
}

// We want to create a HashMap to store the key value pairs of the value itself and its location in the input array
// then we want to loop through the input array
// if we have not seen the value in the array yet we add it to the hashmap
// We then check if the target - the current value in array exists, if it does then we return i and the key from the map
