package com.heima.File;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter{

	//定义类实现文件名称FilenameFilter过滤器
	public boolean accept(File dir, String name) {
		
		
		return name.endsWith(".txt");
	}

}
