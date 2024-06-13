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
    public int maximumSum; 
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
       }
       int leftSum=dfs(root.left);
       int rightSum=dfs(root.right);

       leftSum = Math.max(leftSum,0);
       rightSum= Math.max(rightSum,0);

       int currSum=leftSum+ rightSum + root.val;
       maximumSum= Math.max(currSum , maximumSum);
       return Math.max(leftSum, rightSum )+root.val;
    }
    public int maxPathSum(TreeNode root) {
        maximumSum=Integer.MIN_VALUE;
        dfs(root);
        return maximumSum;
    }
}