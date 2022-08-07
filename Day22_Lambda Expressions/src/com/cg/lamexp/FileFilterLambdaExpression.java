package com.cg.lamexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilter obj = (File pathname) -> pathname.getName().endsWith(".jpg");
		File dir = new File("C:\\Users\\ravir\\Desktop");
		File[] contents = dir.listFiles(obj);
		for (File i: contents)
		{
			System.out.println(i);
		}
	}

}
