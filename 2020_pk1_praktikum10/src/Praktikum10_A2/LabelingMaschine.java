package Praktikum10_A2;

import praktikum10_Aufgabe2.Conveyor;
import praktikum10_Aufgabe2.Bottle;

public class LabelingMaschine implements Runnable {
	private Conveyor forderband;
	private Bottle bottle;

	public LabelingMaschine(Conveyor forderband) {
		this.forderband = forderband;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				synchronized(forderband){
					while(forderband.isEmpty()) {
						System.out.println("Etikettiermaschine: Warten, da Foerderband leer");
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
