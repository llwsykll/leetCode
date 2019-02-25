# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        if root == None or root.left == root.right == None:return True
        if self.subIsBalanced(root)==-1:return False
        return True

    def subIsBalanced(self, root: TreeNode)->int:
        if root== None: return 0
        left = self.subIsBalanced(root.left)
        right = self.subIsBalanced(root.right)
        if left-right >1 or right-left>1 or left == -1 or right == -1:return -1
        return 1+max(left,right)
