package praktikum3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	private Medienverwaltung mv;
	Scanner scanner = new Scanner(System.in);

	public Menu() {
		this.mv = new Medienverwaltung();
	}

	public void menu() {
		int n;
		do {
			druckMenu();
			n = scanner.nextInt();
			switch (n) {
			case 1:
				System.out.println("1. Audio aufnehmen");
				AudioAufnehmenDialog();
				break;
			case 2:
				System.out.println("2. Bild aufnehmen");
				BildAufnehmenDialog();
				break;
			case 3:
				System.out.println("3. Zeige alle Medien");
				mv.zeigeMedien();
				break;

			case 4:
				System.out.println("4. Zeige neues Medien");
				mv.sucheNeuesMedium();
				break;
			case 5:
				System.out.println("5. Berechne durchschnittliches Erscheinungsjahr");
				mv.berechneErscheinungsjahr();
				break;
			default:
				System.out.println("6. Beenden");
				break;
			}
		} while (n > 0 && n < 7);
	}
/*
	public void menv() {
		int n;
		do {
			druckMenu();
			n = scanner.nextInt();
			switch (n) {
			case 1:
				AudioAufnehmenDialog();
				break;
			case 2:
				BildAufnehmenDialog();
				break;
			case 3:
				mv.zeigeMedien();
				break;
			case 4:
				mv.sucheNeuesMedium();
				break;
			case 5:
				mv.berechneErscheinungsjahr();
				break;
			case 6:
				break;
			default:
				break;
			}

		} while (n > 0 );
	}*/

	public void druckMenu() {
		System.out.println("Medienverwaltung");
		System.out.println("");
		System.out.println("1. Audio aufnehmen");
		System.out.println("2. Bild aufnehmen");
		System.out.println("3. Zeige alle Medien");
		System.out.println("4. Zeige neues Medien");
		System.out.println("5. Berechne durchschnittliches Erscheinungsjahr");
		System.out.println("6. Beenden");
		System.out.println("");
		System.out.println("Bitte Menuepunkt waehlen:");
	}

	public void AudioAufnehmenDialog() {
		String titel = JOptionPane.showInputDialog(null, "Titel");
		String sjahr = JOptionPane.showInputDialog(null, "Jahr");
		int jahr = Integer.parseInt(sjahr);
		String interpret = JOptionPane.showInputDialog(null, "Interpret");
		String sdauer = JOptionPane.showInputDialog(null, "dauer");
		int dauer = Integer.parseInt(sdauer);
		mv.aufnehmen(new Audio(titel, jahr, interpret, dauer));
	}

	public void BildAufnehmenDialog() {
		String titel = JOptionPane.showInputDialog(null, "Titel");
		String sjahr = JOptionPane.showInputDialog(null, "Jahr");
		int jahr = Integer.parseInt(sjahr);
		String ort = JOptionPane.showInputDialog(null, "Ort");
		mv.aufnehmen(new Bild(titel, jahr, ort));
	}

}
