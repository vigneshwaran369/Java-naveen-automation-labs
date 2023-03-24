package com.ifelsecondition;

public class SwithCaseFindMyHero {

	String hisnameis = "vicky";
	
	
	public void whatisyourname() {
		switch (hisnameis){
		case "vicky":
			System.out.println("nononono");
			break;
		case "dummy":
			System.out.println("nononononono");
			break;
		case "dudu":
			System.out.println("nono");
			break;
		case "meedu":
			System.out.println("no");
			break;
		case "kasdu":
			System.out.println("never");
			break;
		default:
			System.out.println("dei his name is vicky da");
			break;
		}
			
		}
		public static void main(String[] args) {
		SwithCaseFindMyHero hero = new SwithCaseFindMyHero();
		hero.whatisyourname();

	}

}
