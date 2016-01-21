package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(BufferedInputFile
				.read("/Users/anandran/workspace/thinkinginjavasamples/src/com/io/BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/anandran/workspace/basicFileOutput.out")));
		int lineNum = 1;
		String s;
		while((s = br.readLine())!= null){
			out.println(lineNum++ +": "+s);
		}
		out.close();
	}
}
