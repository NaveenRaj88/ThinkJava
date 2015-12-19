package com.innerclass;

interface ContentsParcel7 {
}

public class Parcel7 {
	public ContentsParcel7 contents() {
		return new ContentsParcel7() {
			private int i = 11;

			public int value() {
				return i;
			}

		};
	}

	public static void main(String[] args) {
		Parcel7 p7 = new Parcel7();
		ContentsParcel7 cp7 = p7.contents();

	}
}
