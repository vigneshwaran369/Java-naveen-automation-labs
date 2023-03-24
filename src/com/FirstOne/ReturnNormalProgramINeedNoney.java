package com.FirstOne;
public class ReturnNormalProgramINeedNoney {
   public Integer money = 3000;
   public Integer collectedMyMoney() {
	   System.out.println("got my money :"+money);
	   return money;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnNormalProgramINeedNoney vicky = new ReturnNormalProgramINeedNoney();
		Integer amount = vicky.collectedMyMoney();
		System.out.println("I have that much of rupees"+amount);
		
		

	}

}
