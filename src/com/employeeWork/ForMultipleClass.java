package com.employeeWork;

public class ForMultipleClass {
	int a;
	int b;
	int x;
	String boyname; 
	String girlname; 
	public void imGoingToAddThisValue(int c,int d) {
		
		a=c;
		b=d;
		x=c+d;
		System.out.println("The value is " +x);
		
	}
	public void imGoingToGiveTheNamesForTheseTwoNames(String name1,String name2) {
		
		boyname = name1;
		girlname = name2;
		System.out.println("the boy name is " +boyname+" and girl name is " +girlname);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ForMultipleClass hehe = new ForMultipleClass();
		
		hehe.imGoingToAddThisValue(45,45);
		hehe.imGoingToGiveTheNamesForTheseTwoNames("vvvv", "ssss");		
	}

}
