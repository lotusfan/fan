package com.xcfh.car.util;

public class FIRSTUUPER {

	public static String make(String str) {

		char[] cs = str.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}
}
