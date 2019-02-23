# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root == None:return True
        else: return self.isSubSymmetric(root.left,root.right)
    def isSubSymmetric(self,left:TreeNode,right:TreeNode)->bool:
        if left == right == None:return True
        if left == None or right == None:return False
        if left.val == right.val:
            return self.isSubSymmetric(left.left,right.right) and self.isSubSymmetric(left.right,right.left)
        return False