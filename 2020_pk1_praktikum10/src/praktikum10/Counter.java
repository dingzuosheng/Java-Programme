package praktikum10;

public class Counter implements TimerListener{	
	private int sekunde;
	
	public Counter() {
		sekunde=0;
	}
	@Override
	public void signalPerformed() {
		sekunde=sekunde+1;
		System.out.println(sekunde+" Sekunden seit Start");
		
	}

}
