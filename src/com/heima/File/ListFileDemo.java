package com.heima.File;

import java.io.File;

public class ListFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listFileTest();
	}

	public static void listFileTest() {
		
		File dir = new File("E:\\JAVA��ѧ��Ƶ\\����\\day22\\");
		
		//��ȡ����Ŀ¼�µĵ�ǰ���ļ��Լ��ļ��е����ơ�
		String [] names = dir.list();
		for(String name:names) {
			System.out.println(name);
		}
		
		//��ȡĿ¼�µ�ǰ�ļ��Լ��ļ�����ֻҪ�õ����ļ�������ô�Ϳ��Ի�ȡ������Ҫ����Ϣ
		File [] files = dir.listFiles();
		for(File file:files) {
			System.out.println(file);
		}
	}

}
