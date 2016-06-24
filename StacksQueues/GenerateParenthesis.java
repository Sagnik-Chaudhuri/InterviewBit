package com.interviewBit.StacksQueues;

import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * */
public class GenerateParenthesis {
	public int isValid(String a) {
		if (a.isEmpty())
			return 1;

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < a.length(); i++) {
			char current = a.charAt(i);
			if (current == '{' || current == '(' || current == '[') {
				stack.push(current);
			}

			if (current == '}' || current == ')' || current == ']') {
				if (stack.isEmpty())
					return 0;

				char last = stack.peek();
				if (current == '}' && last == '{' || current == ')'
						&& last == '(' || current == ']' && last == '[')
					stack.pop();
				else
					return 0;
			}

		}
		if (!stack.isEmpty())
			return 0;
		return 1;
	}
}
