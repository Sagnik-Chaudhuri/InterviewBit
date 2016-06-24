package com.interviewBit.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Given a binary tree, return the zigzag level order traversal of its nodes’ values. 
 * (ie, from left to right, then right to left for the next level and alternate between).
 * */

public class ZigZagLevelOrderTraversalBT {
	static class TreeNode {
		TreeNode left, right, next;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (a == null)
			return res;
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		int level = 1;
		ArrayList<Integer> item = new ArrayList<Integer>();
		item.add(a.val);
		res.add(item);
		stack.push(a);
		while (!stack.isEmpty()) {
			LinkedList<TreeNode> newStack = new LinkedList<TreeNode>();
			item = new ArrayList<Integer>();
			while (!stack.isEmpty()) {
				TreeNode node = stack.pop();
				if (level % 2 == 0) {
					if (node.left != null) {
						newStack.push(node.left);
						item.add(node.left.val);
					}
					if (node.right != null) {
						newStack.push(node.right);
						item.add(node.right.val);
					}
				} else {
					if (node.right != null) {
						newStack.push(node.right);
						item.add(node.right.val);
					}
					if (node.left != null) {
						newStack.push(node.left);
						item.add(node.left.val);
					}
				}
			}
			level++;
			if (item.size() > 0)
				res.add(item);
			stack = newStack;
		}
		return res;
	}
}
