package Botanischer_Garten;

public class Turnliste implements Runnable{
	private Counter c;
	private int delay;
	
	public Turnliste(Counter c,int delay) {
		this.c=c;
		this.delay=delay;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {}
			c.inc();
		}
		
	}

}
