package praktikum6;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private Medienverwaltung mv;
	Scanner scanner;

	public Menu() {
		this.mv = new Medienverwaltung();
		/*
		 * String title = "TestDaten"; String title_b = "TestDaten"; String ort =
		 * "ort_b"; String interpreter = "TestDaten"; int jahr = 2000; int dauer = 20;
		 * for (int i = 0; i < 5; i++) { mv.aufnehmen(new Bild(title_b, jahr, ort));
		 * mv.aufnehmen(new Audio(title, jahr, interpreter, dauer)); }
		 */
	}

	public void menu() {
		boolean run = true;
		// Problem war dass scanner nicht neu aktualisiert wird denke ich
		// deswegen muss man scanner.close(); nutzen aber ich habe selber nicht benutzt
		scanner = new Scanner(System.in);
		int auswahl;
		while (run) {
			try {
				druckMenu();
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
					try {
						mv.zeigeMedien(System.out);
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.println("4. Medienliste in Datei schreiben");
					medienlisteInDateiSchreiben();
					break;
				case 5:
					System.out.println("5. Zeige neues Medien");
					mv.sucheNeuesMedium(System.out);
					break;
				case 6:
					System.out.println("6. Berechne durchschnittliches Erscheinungsjahr");
					System.out.println(mv.berechneErscheinungsjahr());
					break;
				case 7:
					System.out.println("7. Speichern in einer Datei Medium.ser");
					mv.speichern();
					break;
				case 8:
					System.out.println("8. Laden die gespeicherte Medien ");
					try {
					 mv.laden();
					}catch(IOException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 9:
					System.out.println("Wird beendet.");
					run = false;
					break;
				default:
				}
			} catch (InputMismatchException e) {
				System.out.println("Bitte eine gültige Zahl eingeben");
				menu();
			} catch (EmptyFilenameException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void druckMenu() {
		System.out.println("Medienverwaltung");
		System.out.println("");
		System.out.println("1. Audio aufnehmen");
		System.out.println("2. Bild aufnehmen");
		System.out.println("3. Zeige alle Medien");
		System.out.println("4. Medienliste in Datei schreiben");
		System.out.println("5. Zeige neues Medien");
		System.out.println("6. Berechne durchschnittliches Erscheinungsjahr");
		System.out.println("7. Speichern in einer Datei Medium.ser");
		System.out.println("8. Laden die gespeicherte Medien ");
		System.out.println("9. Beenden");
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
		invalid = true;
		String sdauer = "";
		while (invalid) {
			try {
				sdauer = JOptionPane.showInputDialog(null, "dauer");
				invalid = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte gültiges Interpret eingeben");
			}
		}
		int dauer = Integer.parseInt(sdauer);
		this.mv.aufnehmen(new Audio(titel, jahr, interpret, dauer));
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
	    this.mv.aufnehmen(new Bild(titel, jahr, ort));
	}

	public void medienlisteInDateiSchreiben() throws EmptyFilenameException {
		String fileName = JOptionPane.showInputDialog(null, "Bitte einen Dateiname eingeben");
		if (fileName == null)
			return;
		while (fileName.equals("")) { // Das Eingabefenster mit cancel
			int wahl = JOptionPane.showConfirmDialog(null, "Dateiname ist leer ! Neuen Dateiname eingeben?", "Fehler",
					JOptionPane.YES_NO_OPTION);
			if (wahl == JOptionPane.NO_OPTION) { // Filename ist leer
				throw new EmptyFilenameException("Dateiname ist leer");
			}
			fileName = JOptionPane.showInputDialog(null, "Bitte einen Dateiname eingeben");
			if (fileName == null)
				return; // Das Eingabefenster mit cancel
		}
		try (FileOutputStream fos = new FileOutputStream(new File(fileName + ".txt"))) {
			mv.zeigeMedien(fos);
		} catch (IOException e) {
			medienlisteInDateiSchreiben();
			e.printStackTrace();
		}
	}

	public void writeToFile() throws EmptyFilenameException {
		String fileName = "";
		fileName = JOptionPane.showInputDialog(null, "Bitte einen Dateiname eingeben");
		if (fileName == null)
			throw new EmptyFilenameException("Dateiname ist leer");
		while (fileName.equals("")) {
			int wahl = JOptionPane.showConfirmDialog(null, "Dateiname ist leer! Neuen Dateiname eingeben?", "Fehler",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (wahl == JOptionPane.NO_OPTION) {
				throw new EmptyFilenameException("Dateiname ist leer ");
			}
			fileName = JOptionPane.showInputDialog(null, "Bitte einen Dateiname eingeben");
			if (fileName == null)
				return;
		}
		try (FileOutputStream fos = new FileOutputStream(fileName + ".txt")) {
			mv.zeigeMedien(fos);
		} catch (IOException e) {
			writeToFile();
			e.printStackTrace();
		}
	}

}
