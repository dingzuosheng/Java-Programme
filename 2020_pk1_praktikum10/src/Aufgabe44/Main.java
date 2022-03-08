package Aufgabe44;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Pingpang("Ping",500));
		Thread t2 = new Thread(new Pingpang("Pong",500));
		
		t1.start();
		t2.start();
		
		System.out.println("Ende Main");

	}

}
