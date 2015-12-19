package com.initialization;

import java.util.ArrayList;
import java.util.List;

public class MemoryByteCreation {

	public static void main(String[] args) {
		List<Long[]> longList = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			longList.add(new Long[1024*1024*1024*1024*1024*1024]);
		}
		System.out.println(longList.size());
	}
}
