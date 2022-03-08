package Beispiel_von_Vorlesung;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Pingpang("Ping",500);
		Thread t2 = new Pingpang("Pong",500);
		
		t1.start();
		t2.start();
		
		System.out.println("Ende Main");

	}

}
