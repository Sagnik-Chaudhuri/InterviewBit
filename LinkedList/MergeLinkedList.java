package com.interviewBit.LinkedList;

/*
 * Merge two sorted linked lists and return it as a new list. The new list 
 * should be made by splicing together the nodes of the first two lists, 
 * and should also be sorted.
 * 
 * */
public class MergeLinkedList {
	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode mergeTwoLists(ListNode a, ListNode b) {

		ListNode p1 = a;
		ListNode p2 = b;

		ListNode fakeHead = new ListNode(0);
		ListNode p = fakeHead;

		while (p1 != null && p2 != null) {
			if (p1.val <= p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}

			p = p.next;
		}

		if (p1 != null)
			p.next = p1;
		if (p2 != null)
			p.next = p2;

		return fakeHead.next;

	}
}
