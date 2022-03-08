package Praktikum10_A2;

import praktikum10_Aufgabe2.Conveyor;
import praktikum10_Aufgabe2.Bottle;


public class BottlingPlant implements Runnable{
	private Conveyor forderband;
	private Bottle bottle;
	
	public BottlingPlant(Conveyor forderband) {
		this.forderband = forderband;
	}
	
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			try {
				synchronized(forderband) {
					while(forderband.isOverloaded()) {
						System.out.println("Anfuellanlage: Warte , da Foerderband voll");
						forderband.wait();
					}
					System.out.println("Abfuellanlage: Neue Flasche abgefuellt");
					bottle = new Bottle(new Label("Bier",2021));
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
