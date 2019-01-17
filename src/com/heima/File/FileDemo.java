package com.heima.File;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Demo_1();
		//Demo_2();
		Demo_3();
	}

	public static void Demo_3() {
		//-----------对目录操作 创建，删除，判断------------
		
		File dir = new File("E:\\JAVA教学视频\\黑马\\day22\\abc\\qwe");
		
		//mkdir()创建单个目录。//dir.mkdirs();创建多级目录
		boolean b4 = dir.mkdirs();
		System.out.println("b4:"+b4);
		
		//删除目录时，如果目录中有内容，无法直接删除。
//		boolean b5 = dir.delete();
//		System.out.println("b5:"+b5);
		
		//-----------判断文件，目录------------
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
	}

	public static void Demo_2() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\JAVA教学视频\\黑马\\day22\\file.txt");
		// 创建文件，如果文件不存在，创建 true 如果文件存在，则不创建 false。 如果路径错误，IOException。
		boolean b1 = file.createNewFile();		
		System.out.println("b1:"+b1);
		
		//-----------删除文件操作-------注意：不去回收站。慎用------
		boolean b2 = file.delete();
		System.out.println("b2"+b2);
		
		//-----------需要判断文件是否存在------------
		boolean b3 = file.exists();
		System.out.println("b3:"+b3);
		
		
	}

	public static void Demo_1() {
		// TODO Auto-generated method stub

		File file = new File("Test22.java");
		
		String absPath = file.getAbsolutePath();
		
		String path = file.getPath();
		
		String name = file.getName();
		
		long size = file.length();
		
		System.out.println(absPath);
		System.out.println(path);
		System.out.println(name);
		System.out.println(size);
	}

}
