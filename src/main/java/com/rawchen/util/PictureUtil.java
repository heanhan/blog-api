package com.rawchen.util;

public class PictureUtil {

	public static String randomBlogFirstPicture() {
		int m = 0;
		int n = 9;
		int temp=m+(int)(Math.random()*(n+1-m));
		return "/img/"+temp+".jpg";
	}
}
