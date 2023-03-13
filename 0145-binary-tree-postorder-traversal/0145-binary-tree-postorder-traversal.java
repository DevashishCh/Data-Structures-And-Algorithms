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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans =new ArrayList<>();
        check(root,ans);
        return ans;
    }
    public void check(TreeNode root , ArrayList<Integer> ans) {
        if(root==null) {
            return;
        }
        check(root.left,ans);
        check(root.right,ans);
        ans.add(root.val);
    }
}