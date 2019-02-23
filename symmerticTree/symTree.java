/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else return isSubSymmetric(root.left,root.right);
    }
    public boolean isSubSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val ==right.val)
            return isSubSymmetric(left.left,right.right)&&isSubSymmetric(left.right,right.left);
        return false;
    }
}