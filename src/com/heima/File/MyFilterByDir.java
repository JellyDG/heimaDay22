package com.heima.File;

import java.io.File;
import java.io.FileFilter;

public class MyFilterByDir implements FileFilter {
	//ÎÄ¼ş¹ıÂËÆ÷
	@Override
	public boolean accept(File pathName) {
		
		return pathName.isDirectory();
	}

}
