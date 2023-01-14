package com.core.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.sql.DataSource;

public class Constants {
//	main
	public static String c3p0="java:comp/env/jdbc/c3p0";

//	tomcat
	public static String tomcat="jdbc/cga105g2";

	public static String date=tomcat;

	public static DataSource DATASOURCE;
	public static final Gson GSON = new GsonBuilder().create();
	public static final String JSON_MIME_TYPE = "application/json";
	public static final String PREFIX_WEB_INF = "/WEB-INF";
}
