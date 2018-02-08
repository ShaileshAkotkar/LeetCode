package com.leetcode.easy;

import org.apache.commons.lang3.time.StopWatch;

public class Question7_ReverseInteger {

	public int reverse(int x) {
		
		int r = 0;
		while( x != 0) {
			
			if ( (r * 10)/10 != r) {
				return 0;
			}
			r = (r*10) + (x%10);
			x = x /10;
		}
		
		return r ;		
    }
	
	public static void main(String[] args) {
		
		int nums = -999999998;
		StopWatch sw = new StopWatch();
		sw.start();
		System.out.println(new Question7_ReverseInteger().reverse(nums));
		sw.stop();
		System.out.println("Time in millis : " + sw.toString());
		/*
		System.out.println(nums%1000);
		System.out.println(nums%10000);*/
	}
}
