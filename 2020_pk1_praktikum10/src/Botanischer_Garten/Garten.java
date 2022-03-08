package Botanischer_Garten;

public class Garten {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Thread west = new Thread(new Turnliste(c,100));
		Thread east = new Thread(new Turnliste(c,100));
		
		west.start();
		east.start();
		
		System.out.println("Ende Main");
		

	}

}
