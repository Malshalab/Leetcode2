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

 // Do BFS then at each level return the right most value of each level
 // return the list of all the right most nodes
 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result= new ArrayList<>() ;
        Queue<TreeNode> queue= new LinkedList<>() ;
        queue.offer(root) ;
        if(root==null) return result ;
        while(!queue.isEmpty()){
            int levelSize=queue.size() ;

            for(int i=0 ;i<levelSize;i++){
                TreeNode currentNode= queue.poll() ;
                if(i==levelSize-1){
                    result.add(currentNode.val) ;
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left) ;
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right) ;

                }
            }
        }

        return result ;

    }
}
