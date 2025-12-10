//! 144 LeetCode Binary Tree Preorder Traversal
//* TC O(N)
//* SC O(N)
//? Preorder Traversal: Root -> Left -> Right
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        preorder(root,res);
        return res;
    }
    private void preorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}