import java.util.Scanner;

import javax.swing.JOptionPane;

public class menu {
	private Medienverwaltung mv;
	public menu(Medienverwaltung mv) {
		this.mv=mv;
	}
	public void menu() {
		Scanner scanner=new Scanner(System.in);
		int n;
		do {
			printAusgabe();
			n=scanner.nextInt();
			switch(n) {
			case 1: System.out.println("1. Audio aufnehmen");
					audioAufnehmenDialog();
					break;
			case 2: System.out.println("2. Bild aufnehmen");
					bildAufnehmenDialog();
					break;
			case 3: System.out.println("3. Zeige alle Medien");
					mv.zeigeMedien();
					break;
			case 4: System.out.println("4. Zeige neues Medium");
					mv.sucheNeuesMedium();
					break;
			case 5: System.out.println("5. Berechne durchschnittliches Erscheinungsjahr");
					System.out.println(mv.berechneErscheinungsjahr());
					break;
			default:System.out.println("Beenden");
					break;
					
			}
		}while(n>0&&n<7);
	}
	public void printAusgabe() {
		System.out.println("Medienverwaltung");
		System.out.println("");
		System.out.println("1. Audio aufnehmen");
		System.out.println("2. Bild aufnehmen");
		System.out.println("3. Zeige alle Medien");
		System.out.println("4. Zeige neues Medium");
		System.out.println("5. Berechne durchschnittliches Erscheinungsjahr");
		System.out.println("6. Beenden");
		System.out.println("");
		System.out.println("Bitte Menuepunkt waehlen:");
	}
	public void audioAufnehmenDialog() {
		String titel=JOptionPane.showInputDialog(null,"Titel");
		String sjahr=JOptionPane.showInputDialog(null,"Jahr");
		int jahr=Integer.parseInt(sjahr);
		String interpret=JOptionPane.showInputDialog(null,"Interpret");
		String sdauer=JOptionPane.showInputDialog(null,"Dauer");
		int dauer=Integer.parseInt(sdauer);
		mv.aufnehmen(new Audio(titel,jahr,interpret,dauer));
		
	}
	public void bildAufnehmenDialog() {
		String titel=JOptionPane.showInputDialog(null,"Titel");
		String sjahr=JOptionPane.showInputDialog(null,"Jahr");
		int jahr=Integer.parseInt(sjahr);
		String ort=JOptionPane.showInputDialog(null,"Ort");
		mv.aufnehmen(new Bild(titel,jahr,ort));
	}
	 
	
	
}
