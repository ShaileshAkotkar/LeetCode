package com.leetcode.easy;

import org.apache.commons.lang3.time.StopWatch;

public class Question58_LengthOfLastWord {

	public int lengthOfLastWord(String s) {

		int len = s.length();
		if (len == 0)
			return 0;
		len--;
		while (len >= 0 && s.charAt(len) == ' ') {
			len--;
		}
		int counter = 0;
		while (len >= 0 && s.charAt(len) != ' ') {
			len--;
			counter++;
		}

		return counter;
	}

	public static void main(String[] args) {
		String str = "ads sdi ";
		StopWatch sw = new StopWatch();
		sw.start();
		System.out.println(new Question58_LengthOfLastWord().lengthOfLastWord(str));
		sw.stop();
		System.out.println("Time in millis : " + sw.toString());
	}
}
