package com.FirstOne;

public class NormalProgramBuyProducts {
	public void amazon () {
		System.out.println("amazon : mobile");
	}
	public void flipkart() {
		System.out.println("flipkart = watch and headset");
		
	}
	public void adkOnlineShopping() {
		System.out.println("adkonlineshopping *** tv,fridge,washing machine,AC");
	}
      public void abcOnlineShopping() {
	  System.out.println("abconlineshopping --- laptop & computers ");
	  
      }
      public void vickyOnlineShopping() {
    	  System.out.println("bought one mobile and samsunggalexy note 6 s7 and one washing machine and television");
    	  
      }
	
	public static void main(String[] args) {

		System.out.println("######Buying everything from online######");

		NormalProgramBuyProducts foruse = new NormalProgramBuyProducts();
		foruse.amazon();
		foruse.flipkart();
		foruse.vickyOnlineShopping();
		foruse.adkOnlineShopping();
		foruse.abcOnlineShopping();
		
		
		
      
	}

}
