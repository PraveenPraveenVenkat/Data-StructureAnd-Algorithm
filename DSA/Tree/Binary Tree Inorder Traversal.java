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
//! 94 LeetCode Binary Tree Inorder Traversal
//* TC O(N)
//* SC O(N)
//? Inorder Traversal: Left -> Root -> Right
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res=new ArrayList<Integer>();
        inorder(root,res);
        return res;
    }
    private void inorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}