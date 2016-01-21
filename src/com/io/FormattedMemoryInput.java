package com.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
	public static void main(String[] args) {
		DataInputStream in;
		try {
			in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile
					.read("/Users/anandran/workspace/thinkinginjavasamples/src/com/io/FormattedMemoryInput.java")
					.getBytes()));
			while (true) {
				System.out.print((char)in.readByte());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
