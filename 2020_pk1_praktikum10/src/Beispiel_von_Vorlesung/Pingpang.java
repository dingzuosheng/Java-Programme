package Beispiel_von_Vorlesung;

public class Pingpang extends Thread {
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
				sleep(delay);
			}catch(InterruptedException e) {
				break;
			}
		}
	}
}
