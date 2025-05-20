class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>() ;

        for(int i=0 ; i<nums.length; i++){
            minHeap.offer(nums[i]) ;

            if(minHeap.size()>k){
                minHeap.poll() ;
            }
        }

        return minHeap.peek() ;
    }
}

// set up a min queue
// if the value at the top of the min queue is less then pop it and add the new element
// the result is the top of the min queue
