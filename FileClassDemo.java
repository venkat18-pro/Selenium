package com.venkat;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\FileDemo\\first.txt");
//		System.out.println(file.createNewFile());
//		String[] lists = file.list();
//		for(String list: lists) {
//			System.out.println(list);
//		}
//		File[] listFiles = file.listFiles();
//		for (File file2 : listFiles
//			System.out.println(file2);
//		}
		
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.delete());
		
	}

}
