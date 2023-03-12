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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> listResult = new ArrayList<>();
        goDFS(root, 0, targetSum, new ArrayList<>(), listResult);
        return listResult;
    }

    private void goDFS(TreeNode node, int currSum, int targetSum, ArrayList<Integer> list, List<List<Integer>> listResult) {
        if (node == null) return;
        
        currSum += node.val;
        list.add(node.val);

        if (node.left == null && node.right == null && currSum == targetSum) {
            listResult.add(new ArrayList<>(list));
        }
    
        goDFS(node.left, currSum, targetSum, list, listResult);
        goDFS(node.right, currSum, targetSum, list, listResult);
        list.remove(list.size() - 1);
    }
}