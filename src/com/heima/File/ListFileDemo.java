package com.heima.File;

import java.io.File;

public class ListFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listFileTest();
	}

	public static void listFileTest() {
		
		File dir = new File("E:\\JAVA教学视频\\黑马\\day22\\");
		
		//获取的是目录下的当前的文件以及文件夹的名称。
		String [] names = dir.list();
		for(String name:names) {
			System.out.println(name);
		}
		
		//获取目录下当前文件以及文件对象，只要拿到了文件对象，那么就可以获取其中想要的信息
		File [] files = dir.listFiles();
		for(File file:files) {
			System.out.println(file);
		}
	}

}
