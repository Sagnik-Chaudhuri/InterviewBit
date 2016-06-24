package com.interviewBit.StacksQueues;

import java.util.Stack;

/*
 * Write a program to validate if the input string has redundant braces?
 Return 0/1 
 * */
public class RedundantBraces {
	public int braces(String a) {
		char[] array = a.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < array.length; ++i) {

			if (array[i] == ')') {

				int count = 0;

				while (stack.peek() != '(') {
					stack.pop();
					count++;
				}

				stack.pop();
				if (count < 2)
					return 1;
			}

			else {
				stack.push(array[i]);
			}
		}

		boolean isBracePresent = true;

		while (!stack.isEmpty()) {

			if (stack.peek() == '(') {
				isBracePresent = false;
				break;
			}
			stack.pop();
		}

		if (!isBracePresent)
			return 1;
		return 0;
	}
}
