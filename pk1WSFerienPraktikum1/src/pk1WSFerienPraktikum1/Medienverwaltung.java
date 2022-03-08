package pk1WSFerienPraktikum1;

public class Medienverwaltung {
	int n;
	private	Medium[] dieMedien=new Medium[n];
	private int anzMedien=0;
	public void aufnehmen(Medium einMedium) {
		if(anzMedien<dieMedien.length) {
			dieMedien[anzMedien++]=einMedium;
		}else {
			System.out.println("Die Medienverwaltung ist schon voll!");
		}
	}
	public void zeigeMedien() {
		for(int i=0;i<dieMedien.length;i++) {
			if(dieMedien[i]!=null) {
				System.out.println(dieMedien[i]);
			}
		}
	}
	public void sucheNeuesMedium() {
		int min =dieMedien[0].alter();
		int index=0;
		for(int i=1;i<dieMedien.length;i++) {
			if(dieMedien[i].alter()<min) {
				min=dieMedien[i].alter();
				index=i;
			}
		}
		dieMedien[index].druckDaten();
	}
	public double berechneErscheinungsjahr() {
		double summe=0.0;
		if(dieMedien!=null) {
		  for(int i=0;i<dieMedien.length;i++) {
			 if(dieMedien[i]!=null) {
				summe+=dieMedien[i].alter();
			 }
		  }
		  return summe/anzMedien;
		}else {
			return 0.0;
		}	
	}
}
