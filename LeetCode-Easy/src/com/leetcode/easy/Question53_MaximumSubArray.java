package com.leetcode.easy;

import org.apache.commons.lang3.time.StopWatch;

public class Question53_MaximumSubArray {

	public int maxSubArray(int[] nums) {

		int res;
		
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		else {
			int sum = nums[0];
			res = sum;

			for (int i = 1; i < nums.length; i++) {
				
				System.out.println("*******************************************************");
				System.out.println("Iteration : " + i);
				System.out.println("Number : " + nums[i]);
				System.out.println("Local Sum " + (sum + nums[i]));
							
				sum = Math.max(sum + nums[i], nums[i]);
				res = Math.max(res, sum);
				
				System.out.println("Result" + res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		StopWatch sw = new StopWatch();
		sw.start();
		System.out.println(new Question53_MaximumSubArray().maxSubArray(nums));
		sw.stop();
		System.out.println("Time in millis : " + sw.toString());
	}
}
