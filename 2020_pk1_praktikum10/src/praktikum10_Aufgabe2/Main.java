package praktikum10_Aufgabe2;

public class Main {

	public static void main(String[] args) {
		Conveyor forderband = new Conveyor();
		
		BottlingPlant bp = new BottlingPlant(forderband);
		LabelingMaschine lm = new LabelingMaschine(forderband);
		
		Thread tb = new Thread(bp);
		Thread tl = new Thread(lm);
		
		tb.start();
		tl.start();

	}

}
