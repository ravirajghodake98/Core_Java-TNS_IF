package com.cg.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your string: ");
		String str = obj.readLine();
		System.out.println(str);
	}

}