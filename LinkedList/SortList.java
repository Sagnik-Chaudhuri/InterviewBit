package com.interviewBit.LinkedList;

/*
 * Sort a linked list in O(n log n) time using constant space complexity.
 * */

public class SortList {
	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode sortList(ListNode a) {
		if (a == null || a.next == null)
			return a;
		ListNode first = a;
		ListNode middle = findMiddle(a);
		ListNode second = middle.next;
		middle.next = null;
		return merge(sortList(first), sortList(second));
	}

	public static ListNode findMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static ListNode merge(ListNode first, ListNode second) {
		ListNode newHead = new ListNode(-1);
		ListNode current = newHead;
		while (first != null && second != null) {
			if (first.val <= second.val) {
				current.next = first;
				first = first.next;
			} else {
				current.next = second;
				second = second.next;
			}
			current = current.next;
		}
		if (first == null)
			current.next = second;
		else
			current.next = first;
		return newHead.next;
	}
}
