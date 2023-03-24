package com.FirstOne;

public class StringFromYouTubeNewOneForUs {
	String boyname;
	String girlname;
	StringFromYouTubeNewOneForUs(String boy,String girl){
		
		boyname = boy;
		girlname = girl;
		
	}
	public void whoisthis() {
		System.out.println("they are going to marry");
		System.out.println("boy names is:"+boyname+" and girl names is:"+girlname);
	}
	
	
	public static void main(String[] args) {
   
		StringFromYouTubeNewOneForUs us = new StringFromYouTubeNewOneForUs("vvv","sss");
	us.whoisthis();
	

	}

}
