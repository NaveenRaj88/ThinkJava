package com.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class TestEOF {

	public static void main(String[] args) throws IOException {
		DataInputStream di = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("/Users/anandran/workspace/thinkinginjavasamples/src/com/io/TestEOF.java").getBytes()));
		while(di.available() != 0){
			System.out.print((char) di.read());
		}
	}
}
