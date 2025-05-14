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
    ArrayList<Integer> smallest= new ArrayList<>() ;

    public int kthSmallest(TreeNode root, int k) {
        
        traversal(root) ;
        return(smallest.get(k-1)) ;
    }

    public void traversal(TreeNode root){
        if(root==null){
            return ;
        }
        traversal(root.left) ;
        smallest.add(root.val) ;
        traversal(root.right) ;
    }
}

// go through the tree and add the value of the smallest elemtn to an array
// at the end return the kth index of the array
