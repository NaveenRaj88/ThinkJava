package com.io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader reader = new StringReader(
				BufferedInputFile.read("/Users/anandran/workspace/thinkinginjavasamples/src/com/io/MemoryInput.java"));
		int c;
		while ((c = reader.read()) != -1) {
			System.out.print((char)c);
		}
	}
}
