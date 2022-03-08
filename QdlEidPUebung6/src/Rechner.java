
import java.util.Scanner;

public class Rechner {
	Scanner scanner;
	private Bruch[] dieBrueche = new Bruch[100];
	int anzBrueche = 0;
	private Potenz[] diePotenze = new Potenz[100];
	int anzPotenze = 0;

	public Rechner(Scanner scanner) {
		this.scanner=scanner;
	}

	public void add(Bruch bruch) {
		if (anzBrueche < dieBrueche.length) {
			dieBrueche[anzBrueche++] = bruch;
		}
	}

	public void add(Potenz potenz) {
		if (anzPotenze < diePotenze.length) {
			diePotenze[anzPotenze++] = potenz;
		}
	}

	public String verknuepfeAlle(String verknuepfung) {
		String str="";
		boolean erstes=true;
		for(int i=0;i<anzBrueche;i++) {
			if(erstes)
				erstes=false;
			else
				str+=verknuepfung;
			str+=dieBrueche[i];
		}
		for(int i=0;i<anzPotenze;i++) {
			if(erstes)
				erstes=false;
			else
				str+=verknuepfung;
			str+=diePotenze[i];
		}
		return str;
	}

	public Bruch addiereAlle() {
		Bruch b = new Bruch(0,1);
		for (int i = 0; i <anzBrueche ; i++) {
			b=b.addiere(dieBrueche[i]);
		}
		for (int i = 0; i < anzPotenze; i++) {
			b= b.addiere(diePotenze[i].zuBruch());
		}
		
		return b;
	}

	public Bruch multipliziereAlle() {
		Bruch b = new Bruch(1,1);
		for (int i = 0; i < anzBrueche; i++) {
			b = b.multipliziere(dieBrueche[i]);
		}
		for (int i = 0; i < anzPotenze; i++) {
			b = b.multipliziere(diePotenze[i].zuBruch());
		}
		return b;
	}

	public Bruch liesBruch() {
		System.out.println("Zaehler: ");
		int z=scanner.nextInt();
		System.out.println("Nenner: ");
		int n=scanner.nextInt();
		Bruch b=new Bruch(z,n);
	//	scanner.close();
		return b;
	}

	public Potenz liesPotenz() {
		System.out.println("Bruch :");
		Bruch b=liesBruch();
		System.out.println("Exponent: ");
		int e=scanner.nextInt();
		Potenz p= new Potenz(e,b);
	//	scanner.close();
		return p;
	}

}
