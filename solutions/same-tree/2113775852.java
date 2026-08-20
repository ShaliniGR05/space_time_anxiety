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
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder1(p);
        preorder2(q);
        if(arr1.equals(arr2)) return true;
        return false;
    }

    public void preorder1(TreeNode p){
        if(p==null){
            arr1.add(null);
            return;
        }
        arr1.add(p.val);
        preorder1(p.left);
        preorder1(p.right);
    }

    public void preorder2(TreeNode q){
        if(q==null){
            arr2.add(null);
            return;
        }
        arr2.add(q.val);
        preorder2(q.left);
        preorder2(q.right);
    }
}