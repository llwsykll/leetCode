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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<String>();
        if(root == null) return res ;
        subBTP(root,res,"");
        return res;
    }

    public void subBTP(TreeNode root, ArrayList<String> res, String s){
        if(root.left == null && root.right == null) res.add(s + root.val);
        if(root.left!= null) subBTP(root.left, res, s+root.val+"->");
        if(root.right!= null) subBTP(root.right, res, s+root.val+"->");
    }
}