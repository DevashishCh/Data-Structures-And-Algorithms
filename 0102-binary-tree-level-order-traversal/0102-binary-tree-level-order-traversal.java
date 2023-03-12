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
        List<List<Integer>> ans= new LinkedList<List<Integer>>();
        if(root==null) {
            return ans;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            ArrayList<Integer> temp=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++) {
                TreeNode p=q.remove();
                temp.add(p.val);
                if(p.left!=null) {
                    q.add(p.left);
                }
                if(p.right!=null) {
                    q.add(p.right);
                }
            }

            ans.add(temp);
            }
            return ans;
        }
        
        // List<List<Integer>> arr=new LinkedList<List<Integer>>();
    }
