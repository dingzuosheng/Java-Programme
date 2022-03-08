package praktikum4;

import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private Medienverwaltung mv;
	Scanner scanner;

	public Menu() {
		this.mv = new Medienverwaltung();
	}

	public void menu() {
		boolean run = true;
		// Problem war dass scanner nicht neu aktualisiert wird denke ich
		// deswegen muss man scanner.close(); nutzen aber ich habe selber nicht benutzt
		scanner = new Scanner(System.in);
		int auswahl;
		druckMenu();
		while (run) {
			try {
				auswahl = scanner.nextInt();
				switch (auswahl) {
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
					System.out.println(mv.berechneErscheinungsjahr());
					break;
				case 6:
					System.out.println("6. Beenden");
					run = false;
					break;
				default:
				}
			} catch (InputMismatchException e) {
				// JOptionPane.showMessageDialog(null, "Bitte eine gültige Zahl eingeben");
				System.out.println("Bitte eine gültige Zahl eingeben");
				menu();
			}
		}
	}

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
		boolean invalid = true;
		String titel = "";
		while (invalid) {
			try {
				titel = JOptionPane.showInputDialog(null, "Titel");
				invalid = false;
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Titel eingeben");
			}
		}
		invalid = true;
		String sjahr = "";
		while (invalid) {
			try {
				if (sjahr == null)
					return;// wenn der Button "cancell" gedueckt wird;
				sjahr = JOptionPane.showInputDialog(null, "Jahr");
				invalid = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Erscheinungsjahr eingeben");
			}
		}
		int jahr = Integer.parseInt(sjahr);
		invalid = true;
		String interpret = "";
		while (invalid) {
			try {
				interpret = JOptionPane.showInputDialog(null, "Interpret");
				invalid = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Interpret eingeben");
			}
		}

		// hier noch kein try catch fur sdauer wie oben fur sjahr
		invalid = true;
		String sdauer = "";
		while (invalid) {
			try {
				if(sdauer==null) return ;
				sdauer = JOptionPane.showInputDialog(null, "dauer");
				invalid = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Interpret eingeben");
			}
		}
		int dauer = Integer.parseInt(sdauer);
		mv.aufnehmen(new Audio(titel, jahr, interpret, dauer));
	}

	public void BildAufnehmenDialog() {
		boolean invalid = true;
		String titel = "";
		while (invalid) {
			try {
				titel = JOptionPane.showInputDialog(null, "Titel");
				invalid = false;
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Titel eingeben");
			}
		}
		invalid = true;
		String sjahr = "";
		while (invalid) {
			try {
				if(sjahr==null) return ;
				sjahr = JOptionPane.showInputDialog(null, "Jahr");
				invalid = false;
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Erscheinungsjahr eingeben");
			}
		}
		int jahr = Integer.parseInt(sjahr);
		invalid = true;
		String ort = "";
		while (invalid) {
			try {
				ort = JOptionPane.showInputDialog(null, "Ort");
				invalid = false;
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültigen Ort eingeben");
			}
		}
		mv.aufnehmen(new Bild(titel, jahr, ort));
	}



}
