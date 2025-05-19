class Solution {
    public int lastStoneWeight(int[] stones) {
        int result=0 ;
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b)->b-a) ;

        for(int i=0 ; i<stones.length; i++){
            maxHeap.offer(stones[i]) ;
        }

        while(maxHeap.size()>1){
            int y=maxHeap.poll() ;
            int x=maxHeap.poll() ;

            if(x==y){
                continue ;
            }
            else if(x!=y){
                y=y-x ;
            }
            maxHeap.offer(y) ;
        }
        if(maxHeap.peek()!=null){
            result=maxHeap.peek() ;
        }

        return result ;
    }
}
// create a max heap of size
// find the values of the two heaviest at each point so we pop and pop
// we take the value as the result of the two pops and add it back to the max heap
// repeat until the size of the max heap==1
// return the peek
