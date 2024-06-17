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
// Binary Tree Level Order Traversalclass Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> lt=new List<List<Integer>>;
        while(!q.isEmpty()){
            Node curr=q.pull();
            if(curr==null){
                if(q.isEmpty()){
                    return ;
                }
                q.add(null);

            }

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}