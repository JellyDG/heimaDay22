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
		//-----------��Ŀ¼���� ������ɾ�����ж�------------
		
		File dir = new File("E:\\JAVA��ѧ��Ƶ\\����\\day22\\abc\\qwe");
		
		//mkdir()��������Ŀ¼��//dir.mkdirs();�����༶Ŀ¼
		boolean b4 = dir.mkdirs();
		System.out.println("b4:"+b4);
		
		//ɾ��Ŀ¼ʱ�����Ŀ¼�������ݣ��޷�ֱ��ɾ����
//		boolean b5 = dir.delete();
//		System.out.println("b5:"+b5);
		
		//-----------�ж��ļ���Ŀ¼------------
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
	}

	public static void Demo_2() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\JAVA��ѧ��Ƶ\\����\\day22\\file.txt");
		// �����ļ�������ļ������ڣ����� true ����ļ����ڣ��򲻴��� false�� ���·������IOException��
		boolean b1 = file.createNewFile();		
		System.out.println("b1:"+b1);
		
		//-----------ɾ���ļ�����-------ע�⣺��ȥ����վ������------
		boolean b2 = file.delete();
		System.out.println("b2"+b2);
		
		//-----------��Ҫ�ж��ļ��Ƿ����------------
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
