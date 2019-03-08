# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def binaryTreePaths(self, root: TreeNode) -> List[str]:
        if not root: return []
        res = []
        self.subBTP(root,res,"")
        return res
        
    def subBTP(self, root: TreeNode, res, s):
        if not root.left and not root.right: res.append(s + str(root.val))
        if root.left:self.subBTP(root.left,res,s+str(root.val)+'->')
        if root.right:self.subBTP(root.right,res,s+str(root.val)+'->')
