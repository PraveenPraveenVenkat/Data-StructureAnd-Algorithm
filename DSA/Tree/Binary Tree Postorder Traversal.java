class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        postorder(root,res);
        return res;
    }
    private void postorder(TreeNode root, List<Integer>){
        postorder(root.left,res);
        postorder(roo.right,res);
        res.add(root.val);
    }
}