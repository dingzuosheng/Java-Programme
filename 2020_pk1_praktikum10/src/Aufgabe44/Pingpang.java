package Aufgabe44;

public class Pingpang  implements Runnable{
	private String text;
	private int delay;
	
	public Pingpang(String text,int delay) {
		this.text=text;
		this.delay=delay;
	}
	
	public void run() {
		while(true) {
			System.out.println(text);
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {
				break;
			}
		}
	}
}
