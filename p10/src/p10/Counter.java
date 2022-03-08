package p10;

public class Counter implements TimerListener {
	private int sekunde;

	public Counter() {
		this.sekunde = 0;
	}

	@Override
	public void signalPerformed() {
		sekunde++;
		if (sekunde == 1) {
			System.out.println(sekunde + " Sekunde seit Start");
		}
		System.out.println(sekunde + " Sekunden seit Start");
	}

}
