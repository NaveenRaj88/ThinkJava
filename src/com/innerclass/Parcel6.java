package com.innerclass;

public class Parcel6 {
	
	Destination d;
	private void internalTrcking(final boolean b) {
		if (b) {
			class TrackingSlip implements Destination{
				private String id;

				public TrackingSlip(String s) {
					id = s;
					System.out.println(b);
				}
				String getSlip(){
					return id;
				}
				@Override
				public String readLabel() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			d=ts;
		}
		
	}
	
	public void getInstance(){
		System.out.println(d.readLabel());
		
	}
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.internalTrcking(true);
		p.getInstance();
	}
}
