package praktikum10_Aufgabe2;
public class BottlingPlant implements Runnable {
	private Conveyor forderband;
	private Bottle bottle;
	public BottlingPlant(Conveyor forderband) {	this.forderband=forderband;	}
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			try {
				synchronized (forderband){
					while(forderband.isOverloaded()) {
						System.out.println("Abfuelleange: Warten , da Foerderband voll.");
						forderband.wait();					
					}
					System.out.println("Abfuelleanlage: Neue Flasche abgefuellt");
					bottle = new Bottle(new Lable("Bier",2020));
					forderband.load(bottle);
					forderband.notifyAll();
				}
				Thread.sleep(1500);
			}catch(InterruptedException  e) {	break;}
		}		
	}
}
