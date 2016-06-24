package com.interviewBit.StacksQueues;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element 
 * in constant time.


 * */
public class MinStack {

	static class Node {
		int value;
		int min;
		Node next;

		Node(int x) {
			value = x;
			next = null;
			min = x;
		}
	}

	Node top;

	public void push(int x) {
		if (top == null) {
			top = new Node(x);
		} else {
			Node temp = new Node(x);
			temp.next = top;
			temp.min = Math.min(top.min, x);
			top = temp;
		}
	}

	public void pop() {
		if (top == null) {

			return;
		}

		top = top.next;

	}

	public int top() {
		if (top == null) {

			return -1;
		}

		return top.value;

	}

	public int getMin() {
		if (top == null) {

			return -1;
		}

		return top.min;
	}
}
