class Solution {
    public int longestConsecutive(int[] nums) {
        int finaLength =0 ;
        HashMap<Integer, Boolean> visited = new HashMap<>() ;

        for (int i=0 ; i<nums.length ; i++){
            visited.put(nums[i], false) ;      
        }

        for (int i=0 ; i<nums.length ; i++){
            int currentLength=1 ;
            int nextNum=nums[i]+1 ;
            int prevNum=nums[i]-1 ;

            while(visited.containsKey(nextNum) && visited.get(nums[i])==false){
                currentLength++ ;
                visited.put(nextNum, true) ;

                nextNum++ ;
            }

            while(visited.containsKey(prevNum) && visited.get(nums[i])==false){
                currentLength++ ;
                visited.put(prevNum, true) ;

                prevNum-- ;
            }
            finaLength=Math.max(finaLength, currentLength) ;
        }
    return finaLength ;
    }
}


// Initialize a hashmap
// The hashmap will store the number and if it has been visited or not via boolean flag
// Loop through the nums array
// while looping check to see if the number is in the hashmap and if it has been visited
// if yes we check the current number +1 exists in hashmap, if yes mark it as true and +1 to current longest length
// Do the same thing in the oposite direction
