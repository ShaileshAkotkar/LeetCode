package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*Question:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class Question1_TwoSums {

	public int[] twoSum(int[] nums, int target) {

		int size = nums.length;
		System.out.println(size);
		if (size < 2)
			return new int[2];
		for (int i = 0; i <= size - 2; i++) {
			for (int j = i + 1; j <= size - 1; j++) {
				int temp = nums[i] + nums[j];
				if (temp == target) 
					return (new int[]{i ,j});
				if (temp > target)
					break;
			}
		}
		return (new int[]{0,0});
	}
	
	
	public int[] twoSumOneShot(int[] nums, int target) {
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i]))
				return new int[]{hashMap.get(nums[i]), i};
			hashMap.put(target - nums[i], i);			
		}
		throw new IllegalArgumentException("Not a solution");
	}

	public static void main(String[] args) {

		int num[] = { 2, 7, 11, 15 };
		int target = 22;

		int[] twoSum = new Question1_TwoSums().twoSumOneShot(num, target);

		System.out.println(twoSum[0] + " " + twoSum[1]);
		System.out.println(num[twoSum[0]] + " " + num[twoSum[1]]);
	}
}
