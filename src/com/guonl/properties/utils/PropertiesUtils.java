package com.guonl.properties.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

	public static Properties getInByFilePath(String filePath) throws Exception {

		Properties p = new Properties();
		// p需要InputStream对象进行读取文件，而获取InputStream有多种方法：
		// 1、通过绝对路径:
		// 2、通过Class.getResourceAsStream(path);
		// 3、通过ClassLoader.getResourceAsStream(path);
		try {
			InputStream is = new FileInputStream(filePath);
			p.load(is);
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public static Properties getInByName(String fileName) throws Exception{
		
		Properties p = new Properties();
		// p需要InputStream对象进行读取文件，而获取InputStream有多种方法：
		// 1、通过绝对路径:
		try {
			InputStream is = new FileInputStream(fileName);
			// 2、通过Class.getResourceAsStream(path);
			// 3、通过ClassLoader.getResourceAsStream(path);
			p.load(is);
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
}
