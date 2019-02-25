/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//  java可用全局变量
class Solution {
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        treeMax(root);
        return result;
    }
    
    public int treeMax(TreeNode node){
        if(node == null) return 0;
        int left = treeMax(node.left);
        int right = treeMax(node.right);
        if(Math.abs(right-left)>1) result = false;
        return 1+Math.max(left,right);
    }
}

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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(isSubBalanced(root)==-1) return false;
        return true;
    }
    public int isSubBalanced(TreeNode root){
        if(root==null) return 0;
        int left = isSubBalanced(root.left);
        int right = isSubBalanced(root.right);
        if(left-right>1 ||right-left>1 ||right==-1 || left==-1) return -1;
        return 1+Math.max(left,right);
    }
}