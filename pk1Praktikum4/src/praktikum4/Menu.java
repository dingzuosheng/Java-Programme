package praktikum4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
	private Medienverwaltung mv;

	public Menu(Medienverwaltung mv) {
		this.mv = mv;
	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int n;
		try {
			do {
				printAusgabe();
				n = scanner.nextInt();

				switch (n) {
				case 1:
					System.out.println("1. Audio aufnehmen ");
					audioAufnehemenDialog();
					break;
				case 2:
					System.out.println("2. Bild aufnehmen");
					bildAufnehmenDialog();
					break;
				case 3:
					System.out.println("3. Zeige alle Medien");
					mv.zeigeMedien(System.out);
					break;
				case 4:
					System.out.println("4. Medienliste in Datei schreiben");
					dateienSchreiben();
					break;
				case 5:
					System.out.println("5. Zeige neues Medium");
					mv.sucheNeuesMedium();
					break;
				case 6:
					System.out.println("6. Berechne durchschnittliches Erscheinungsjahr");
					System.out.println(mv.berechneErscheinungsjahr());
					break;
				case 7:
					System.out.println("7. Speichern ");
					mv.speichern();
				case 8:
					System.out.println("8. laden");
					mv.laden();
					break;
				case 9:
					break;
				default:
					System.out.println("ein falsches Eingabe");
					break;

				}
			} while (n != 9);
		} catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Bitte keine Buchstaben eingeben");
		}
		scanner.close();
	}

	private void audioAufnehemenDialog() {
		// TODO Auto-generated method stub
		boolean isOk = true;
		String titel = JOptionPane.showInputDialog("Titel");
		int jahr = 0;
		do {
			try {
				String sjahr = JOptionPane.showInputDialog("Jahr");
				jahr = Integer.parseInt(sjahr);
				isOk = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte gueltiges Jahr eingeben");
				isOk = false;
			}
		} while (!isOk);
		String interpret = JOptionPane.showInputDialog("interpreter");
		String dauer = JOptionPane.showInputDialog("dauer");
		mv.aufnehmen(new Audio(titel, jahr, interpret, Integer.parseInt(dauer)));
	}

	private void bildAufnehmenDialog() {
		boolean isOk = true;
		String titel = JOptionPane.showInputDialog("Titel");
		int jahr = 0;
		do {
			try {
				String sjahr = JOptionPane.showInputDialog("Jahr");
				jahr = Integer.parseInt(sjahr);
				isOk = true;
			} catch (NumberFormatException e) {
				System.out.println("Bitte gueltiges Erscheinungsjahr eingeben");
				JOptionPane.showMessageDialog(null, "Bitte gueltiges Erscheinungsjahr eingeben");
				isOk = false;
			}
		} while (!isOk);
		String ort = JOptionPane.showInputDialog("Ort");
		mv.aufnehmen(new Bild(titel, jahr, ort));
	}

	public void printAusgabe() {
		System.out.println("Medienverwaltung");
		System.out.println("");
		System.out.println("");
		System.out.println("1. Audio aufnehmen ");
		System.out.println("2. Bild aufnehmen");
		System.out.println("3. Zeige alle Medien");
		System.out.println("4. Medienliste in Datei schreiben");
		System.out.println("5. Zeige neues Medium");
		System.out.println("6. Berechne durchschnittliches Erscheinungsjahr");
		System.out.println("7. Speichern ");
		System.out.println("8. laden");
		System.out.println("9. Beenden");
		System.out.println();
		System.out.println();
		System.out.println("Bitte Menuepunkte waehlen");
	}

	public void dateienSchreiben() {
		boolean isOk = true;
		File file = null;
		do {
			try {

				String dateiname = JOptionPane.showInputDialog(null, "Bitte den Dateiname eingeben");
				if (dateiname == null) {
					return; // zu hauptmenu;
				}
				if (dateiname.isEmpty()) {
					throw new EmptyFilenameException();
				}
				file = new File("D:/" + dateiname + ".txt");// neue datei
				isOk = true;
			} catch (EmptyFilenameException e) {
				int erg = JOptionPane.showConfirmDialog(null, "dateiname darf nicht leer sein. eingabe wiederholen£¿");
				if (erg == JOptionPane.YES_OPTION) {// yes bedeutet 0;no bedeutet 1;
					isOk = false;
				} else {
					return; // zu hauptmenu;
				}
			}
			if (file != null) {
				try {
					FileOutputStream fs = new FileOutputStream(file);
					mv.zeigeMedien(fs);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}

		} while (!isOk);
	}

}
