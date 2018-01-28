package com.leetcode.easy;

import java.util.Arrays;

/*Question:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class Question1_TwoSums {

	public int[] twoSum(int[] nums, int target) {

		int size = nums.length;
		int i = 0, j=1;

		if (size < 2)
			return new int[2];

		for (; i <= size - 2; i++) {
			for (; j < size - 1; j++) {
				int temp = nums[i] + nums[j];
				//System.out.println(temp +" "+ i + " " + j);
				if (temp == target) 
					return (new int[]{i ,j});
				if (temp > target)
					break;
			}

		}

		return (new int[]{i ,j});
	}

	public static void main(String[] args) {

		int num[] = { 2, 7, 11, 15 };
		int target = 22;

		int[] twoSum = new Question1_TwoSums().twoSum(num, target);

		System.out.println(twoSum[0] + " " + twoSum[1]);
		System.out.println(num[twoSum[0]] + " " + num[twoSum[1]]);
	}
}
