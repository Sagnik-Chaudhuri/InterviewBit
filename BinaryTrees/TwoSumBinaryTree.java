package com.interviewBit.BinaryTrees;

import java.util.Stack;

/*
 * Given a binary search tree T, where each node contains a positive integer, 
 * and an integer K, you have to find whether or not there exist two different 
 * nodes A and B such that A.value + B.value = K. Return 1 to denote that two such 
 * nodes exist. Return 0, otherwise.
 * 
 * */

public class TwoSumBinaryTree {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int t2Sum(TreeNode A, int B) {

		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		TreeNode cur1 = A;
		TreeNode cur2 = A;

		while (!stack1.isEmpty() || !stack2.isEmpty() || cur1 != null
				|| cur2 != null) {
			if (cur1 != null || cur2 != null) {
				if (cur1 != null) {
					stack1.push(cur1);
					cur1 = cur1.left;
				}

				if (cur2 != null) {
					stack2.push(cur2);
					cur2 = cur2.right;
				}
			} else {
				int val1 = stack1.peek().val;
				int val2 = stack2.peek().val;

				if (stack1.peek() == stack2.peek())
					break;

				if (val1 + val2 == B)
					return 1;

				if (val1 + val2 < B) {
					cur1 = stack1.pop();
					cur1 = cur1.right;
				} else {
					cur2 = stack2.pop();
					cur2 = cur2.left;
				}
			}
		}

		return 0;
	}

}
