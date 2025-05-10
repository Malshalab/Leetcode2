/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // we should iterate through it using bfs
        // have a queue start by appending the root to the queue
        // while the queue is not empty pop from the queue
        // if the left child and the right child of each of the pops is not the same return false

        Queue<TreeNode> queue= new LinkedList<>() ;
        queue.offer(p) ;
        queue.offer(q) ;

        while(!queue.isEmpty()){
            TreeNode first=queue.poll() ;
            TreeNode second=queue.poll() ;

            if(first==null && second==null){
                continue ;
            } else if(first==null || second==null || first.val!=second.val){
                return false ;
            }

            queue.offer(first.left) ;
            queue.offer(second.left) ;
            queue.offer(first.right) ;
            queue.offer(second.right) ;
        }
        return true ;
    }
}
