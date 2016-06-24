package com.interviewBit.Arrays;

/*
 * Find the contiguous subarray 
 * within an array (containing at least one number) which has the largest sum.
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6. 
 */
import java.util.List;

public class MaxSumContiguousSubarray {
	public int maxSubArray(final List<Integer> a) {
		int newSum = a.get(0);
		int sum = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			newSum = Math.max(newSum + a.get(i), a.get(i));
			sum = Math.max(sum, newSum);
		}
		return sum;
	}

}
