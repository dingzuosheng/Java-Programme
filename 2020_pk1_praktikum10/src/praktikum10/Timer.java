package praktikum10;

public class Timer implements Runnable{
	private int delay;
	private Counter counter;
	
	public Timer(Counter counter,int delay) {
		this.counter =counter;
		this.delay=delay;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {
				break;
			}
			counter.signalPerformed();
		}
		
	}

}
