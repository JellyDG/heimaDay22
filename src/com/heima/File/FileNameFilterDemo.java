package com.heima.File;

import java.io.File;

public class FileNameFilterDemo {

	public static void main(String[] args) {
	/*
	 * ����MyFilenameFilter
		//��ȡ��չ��Ϊ.txt�����ļ�
				//����File����
		
		File file  = new File("E:\\JAVA��ѧ��Ƶ\\����\\day22\\");
		//��ȡָ����չ�����ļ�,����Ҫ�������ļ�������չ��ɸѡ����˵��÷�����Ҫ���ݹ�����
		File [] files = file.listFiles(new MyFilenameFilter());
		//������ȡ�������з����������ļ�
		for(File f:files) {
			System.out.println(f);
		}
		
		*/
		
		/*
		 * ����MyFileFilter
		 * 	�����ļ�����
		 */
		File file = new File("E:\\JAVA��ѧ��Ƶ\\����\\day22\\");
		//��ȡָ��Ŀ¼�µ��ļ���
		File [] files = file.listFiles(new MyFilterByDir());
		//������ȡ�������з����������ļ�
		for(File f:files) {
			System.out.println(f);
		}
	}

}
