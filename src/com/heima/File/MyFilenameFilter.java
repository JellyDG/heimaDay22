package com.heima.File;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter{

	//������ʵ���ļ�����FilenameFilter������
	public boolean accept(File dir, String name) {
		
		
		return name.endsWith(".txt");
	}

}
