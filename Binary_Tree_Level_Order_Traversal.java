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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>() ;
        List<List<Integer>> result= new ArrayList<>() ;
        queue.offer(root) ;

        if(root==null) return result ;

        while(!queue.isEmpty()){
            int level= queue.size() ;
            List<Integer> inside= new ArrayList<>() ;

            for(int i=0 ; i<level; i++){
                TreeNode currentNode= queue.poll() ;
                inside.add(currentNode.val) ;

                if(currentNode.left!=null){
                    queue.offer(currentNode.left) ;
                }

                if(currentNode.right!=null){
                    queue.offer(currentNode.right) ;
                }
            }
            result.add(inside) ;
        }

        return result ;
    }
}
