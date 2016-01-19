package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class BufferedReaderEx7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/anandran/workspace/thinkinginjavasamples/src/com/io/BufferedInputFile.java")));
		String line;
		LinkedList<String> fileContents = new LinkedList<>();
		while((line= br.readLine())!= null){
			fileContents.add(line);
		}
		ListIterator<String> revIter = fileContents.listIterator(fileContents.size());
		while (revIter.hasPrevious()) {
			System.out.println(revIter.previous());
			
		}
	}
	
}
