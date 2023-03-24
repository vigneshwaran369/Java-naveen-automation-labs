package com.employeeWork;

public class ArrayWithForLoop {

	public static void main(String[] args) {

		
		int arr[][] =new int[2][2];
		for(int i=1;i<arr.length;i++) 
		for(int j=1;j<arr.length;j++){
			System.out.println(arr[i][j]);
		}
		
		
	}

}
