package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;

public class MakePdfFiles {

	public static void main(String[] args) throws IOException {
		int counter = 100;
		Path sourceFolder = Paths.get("/Users/anandran/WindowsSticker/source");
		Path sourceFilePath = Paths.get("/Users/anandran/WindowsSticker/5NPEDR4AC9DH809728_2262014530523.pdf");
		sourceFilePath = Files.createFile(Paths.get("/Users/anandran/WindowsSticker/5NPEDR43242423409728_2262043230523.pdf"), new FileAttribute[]{});
		while(counter > 0){
			Timestamp ts = new Timestamp(Calendar.getInstance().getTime().getTime());
//			5NPDH4AE0EH466095_20140113_150952.pdf
			Path targetFilePath = Paths.get(sourceFolder.toString()+File.separator+generateRandom(17)+"_"+generateRandom(13)+"_"+generateRandom(5)+".pdf");
			try {
				Files.copy(sourceFilePath, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter--;
		}
	}
	
	public static long generateRandom(int length) {
	    Random random = new Random();
	    char[] digits = new char[length];
	    digits[0] = (char) (random.nextInt(9) + '1');
	    for (int i = 1; i < length; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	    return Long.parseLong(new String(digits));
	}
}
