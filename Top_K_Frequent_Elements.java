class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> freq= new HashMap<>() ;

       for(int i=0 ; i<nums.length ; i++){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i], 1) ;
            }
            else{
                freq.put(nums[i] , freq.getOrDefault(nums[i],0)+1) ;
            }
       }

       PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

       for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            heap.offer(entry) ;
            if (heap.size()>k){
                heap.poll() ;
            }
       }

       int[] result=new int[k] ;

       for(int i=k-1 ; i>=0; i--){
        result[i]=heap.poll().getKey() ;
       }
       return result ;
    }
}

// create a hashmap
// the key in the hashmap would be the value in the array
// the value in the hashmap would be the frequency
// Create a min heap based on frequency
// Maintain top k elements of heap
// extract the top k elemnts of heap
