package com.interviewBit.BinaryTrees;

/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
 * such that adding up all the values along the path equals the given sum.
 * */
public class PathSum {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int hasPathSum(TreeNode a, int b) {
		if (a == null)
			return 0;
		if (a.val == b && (a.left == null && a.right == null))
			return 1;
		else if (hasPathSum(a.left, b - a.val) == 1
				|| hasPathSum(a.right, b - a.val) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

}
