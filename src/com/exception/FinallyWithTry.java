package com.exception;


public class FinallyWithTry {
	public static void main(String[] args) {
		SearchModel s = new SearchModel("zipcode", null, "zip");
		System.out.println(s.getCountAsString());
		
	}
	
	public static String getCountAsString(SearchModel searchModel){
		String count = null;
		try{
			count = searchModel.getCountAsString();
		}finally{
			return count;
		}
	}
}

class SearchModel {
	public String name;
	
	public String label;
	
	public String id;
	
	
	public SearchModel(String name, String label, String id) {
		super();
		this.name = name;
		this.label = label;
		this.id = id;
	}

	
	public String getLabelWithoutCount(){
		return label.replaceFirst(" [(].*[)]$", "");
	}
	
	public String getCountAsString(){
		 String countAsString = label.replaceFirst("^.* [(](.*)[)]$", "$1");
	        if (label.equals(countAsString)) {
	            // no count in the label
	            return "";
	        }
	        return countAsString;
	}
}