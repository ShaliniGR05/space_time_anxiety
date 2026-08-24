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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int left = max_left(root.left);
        int right = max_right(root.right);
        int currentDiameter = left + right;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(currentDiameter,
               Math.max(leftDiameter, rightDiameter));
    }
    public int max_left(TreeNode root){
        if(root == null) return 0;
        int l = max_left(root.left);
        int r = max_left(root.right);
        return 1 + Math.max(l,r);
    }
    public int max_right(TreeNode root){
        if(root == null) return 0;
        int l = max_right(root.left);
        int r = max_right(root.right);
        return 1 + Math.max(l,r);
    }
}