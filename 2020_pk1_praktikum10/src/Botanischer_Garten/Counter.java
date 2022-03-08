package Botanischer_Garten;

public class Counter {
	private int counter;
	
	public Counter() {
		counter = 0;
	}
	
	public void inc() {
		counter = counter +1;
		System.out.println(counter);
	}
}
