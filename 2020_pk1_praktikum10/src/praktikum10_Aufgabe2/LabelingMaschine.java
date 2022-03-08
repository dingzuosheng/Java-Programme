package praktikum10_Aufgabe2;

public class LabelingMaschine implements Runnable {
	private Conveyor forderband;
	private Bottle bottle;
	public LabelingMaschine(Conveyor forderband) {
		this.forderband = forderband;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			try {
				synchronized (forderband) {
					while (forderband.isEmpty()) {
						System.out.println("Etikettiermaschine: Warten , da Foerderband leer.");
						forderband.wait();
					}
					bottle=forderband.withdraw();
					bottle.printLable();
					forderband.notifyAll();
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}

	}

}
