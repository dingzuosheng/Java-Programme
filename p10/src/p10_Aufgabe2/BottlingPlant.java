package p10_Aufgabe2;

public class BottlingPlant implements Runnable {
	private Conveyor forderband;
	private Bottle bottle;
	public BottlingPlant(Conveyor forderband,Bottle bottle) {
		this.forderband = forderband;
	}
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			try {
				synchronized(forderband){
					while(forderband.isOverloaded()) {
						System.out.println("Abfuellanlage: Warten, da Foerderband voll.");
						forderband.wait();// wait() ist von dem Block synchronized
					}
					bottle = new Bottle(new Lable("Bier",2021));
					forderband.load(bottle);
					forderband.notifyAll();
				}
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				break;
			}
		}
		
	}
	
}
