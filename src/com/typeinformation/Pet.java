package com.typeinformation;

public class Pet extends Individual {
	
	private String name;
	private int id;
	
	public Pet(String name, int id) {
		super(name);
		this.name=name;
		this.id=id;
	}

	public Pet() {
		super();
	}
	
	public int id(){
		return this.id;
	}
	
	public String getString(){
		return this.name;
	}
	
	public String toString(){
		return this.name;
	}
}
