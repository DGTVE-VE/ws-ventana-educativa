package com.appspot.wsventanaeducativa.dao.sql;


public class Configuration {

	//private static final Properties props = new Properties();;

	//private static boolean loaded;
	public static boolean test;

	public static String getUser() {
		return getProperty("vema");
	}

	public static String getPassword() {
		return getProperty("vema");
	}

	public static String getUrl() {
		return getProperty("172.16.107.157:3306");
	}

	public static String getPath() {
		return System.getProperty("user.dir")+"\\generated";
	}

	public static synchronized String getProperty(String key) {
		return System.getProperty(key);
	}
}
