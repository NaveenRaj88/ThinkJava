package com.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
	public static FilenameFilter filter(final String regex) {
		// Creation of anonymous inner class:
		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);

			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		}; // End of anonymous inner class
	}

	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0)
			list = path.list();
		else
			list = path.list(filter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list)
			System.out.println(dirItem);
		
		System.out.println("file directories"+ path.listFiles()[1]);
	}
}

class dirList2Practice{
	
	public static FilenameFilter filter(final String regex){
		return new FilenameFilter() {
			private final Pattern pattern = Pattern.compile(regex);
			
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};
	}
	public static void main(String[] args) {
		File file = new File(".");
		String[] list;
			
		if(args.length ==0){
			list = file.list();
		}else{
			list = file.list(filter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list){
			System.out.println(dirItem);
		}
	}
}
