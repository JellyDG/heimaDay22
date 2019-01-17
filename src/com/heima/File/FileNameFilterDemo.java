package com.heima.File;

import java.io.File;

public class FileNameFilterDemo {

	public static void main(String[] args) {
	/*
	 * 调用MyFilenameFilter
		//获取扩展名为.txt所有文件
				//创建File对象
		
		File file  = new File("E:\\JAVA教学视频\\黑马\\day22\\");
		//获取指定扩展名的文件,由于要对所有文件进行扩展名筛选，因此调用方法需要传递过滤器
		File [] files = file.listFiles(new MyFilenameFilter());
		//遍历获取到的所有符合条件的文件
		for(File f:files) {
			System.out.println(f);
		}
		
		*/
		
		/*
		 * 调用MyFileFilter
		 * 	过滤文件名称
		 */
		File file = new File("E:\\JAVA教学视频\\黑马\\day22\\");
		//获取指定目录下的文件夹
		File [] files = file.listFiles(new MyFilterByDir());
		//遍历获取到的所有符合条件的文件
		for(File f:files) {
			System.out.println(f);
		}
	}

}
