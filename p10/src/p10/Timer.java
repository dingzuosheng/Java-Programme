package p10;

public class Timer implements Runnable{
	private int delay;
	private Counter counter;
	public Timer(int delay,Counter counter) {
		this.delay = delay;
		this.counter = counter;
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
