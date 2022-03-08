package p10_Aufgabe2;

public class LabelingMaschine implements Runnable {
	private Conveyor forderband;
	private Bottle bottle;
	public LabelingMaschine(Conveyor forderband,Bottle bottle) {
		this.forderband = forderband;
	}
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			try {
				synchronized(forderband) {
					while(forderband.isEmpty()) {
						System.out.println("Etikettiermaschine: Waten, da Foerderband leer");
						forderband.wait();
					}
					bottle = forderband.withdraw();
					bottle.printLable();
					forderband.notifyAll();
				}
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				break;
			}
		}
		
	}
}
