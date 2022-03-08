package pk1.av.fachlogik;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	private Angestellteverwaltung aw;
	Scanner scanner = new Scanner(System.in);

	public Menu(Angestellteverwaltung aw) {
		// this.aw = new Angestellteverwaltung();
		this.aw = aw;
	}

	public void menu() {
		boolean run = true;
		int auswahl;
		while (run) {
			try {
				druckeMenu();
				auswahl = scanner.nextInt();
				switch (auswahl) {
				case 1:
					System.out.println("Einen Therapeut anstellen");
					therapeutAufnahmeDialog();
					break;
				case 2:
					System.out.println("Eine MedAngestellte anstellen");
					medAngestellteAufnahmeDialog();
					break;
				case 3:
					System.out.println("Zeige alle Angestellten");
					aw.zeigeAngestellte(System.out);
					break;
				case 4:
					System.out.println("Schreiben die Angestellterliste in die Datei");
					writeAngestelltenlisteInFile();
					break;
				case 5:
					System.out.println("Zeige jungste Angestellte");
					aw.sucheJungsteKollege(System.out);
					break;
				case 6:
					System.out.println("Berechne durchschnittlichen Lohn der Angestellten");
					System.out.println(aw.berechneDurchschnittLohnen());
					break;
				case 7: 
					System.out.println("Speichern die Objects in einer Datei Angestellten.ser");
					aw.speichern();
					break;
				case 8:
					System.out.println("Laden die gespeicherten Angestellten");
					aw.laden();
					break;
				case 9:
					System.out.println("Beenden");
					run = false;
					break;
				default:
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Bitte geben Sie eine gueltige Zahl ein !");
				menu();
			} catch (EmptyFilenameException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void druckeMenu() {
		System.out.println("Angestellteverwaltung");
		System.out.println("");
		System.out.println("1.Therapeut aufnehmen ");
		System.out.println("2.MedAngestellte aufnehmen ");
		System.out.println("3.Zeige alle Angestellten ");
		System.out.println("4.Zeige jungste Angestellte");
		System.out.println("5.Berechne durchschnittlichen Lohn der Angestellten");
		System.out.println("6.Beenden");
		System.out.println("");
		System.out.println("Bitte Menuepunkt waehlen: ");

	}
	public String eingabe(String eingabe_titel) {
		String user_eingabe = "";
		boolean valid = false;
		while (!valid) {
			try {
				user_eingabe = JOptionPane.showInputDialog(null, eingabe_titel);
				if (user_eingabe == null)
					break;
				valid = true;
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Bitte einen gueltigen "+eingabe_titel+" eingeben");
			}
		}
		return user_eingabe;
	}
	public int eingabe_int(String eingabe_titel) {
		String user_eingabe = "";
		boolean valid = false;
		int int_user_eingabe=0;
		while (!valid) {
			try {
				user_eingabe = JOptionPane.showInputDialog(null, eingabe_titel);
				if (user_eingabe == null)
					break;
				int_user_eingabe = Integer.parseInt(user_eingabe);
				valid = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte einen gueltigen "+eingabe_titel+" eingeben");
			}
		}	
		return int_user_eingabe;
	}
	public double eingabe_double(String eingabe_titel) {
		String user_eingabe = "";
		boolean valid = false;
		double double_user_eingabe=0.0;
		while (!valid) {
			try {
				user_eingabe = JOptionPane.showInputDialog(null, eingabe_titel);
				if (user_eingabe == null)
					break;
				double_user_eingabe = Double.parseDouble(user_eingabe);
				valid = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte einen gueltigen "+eingabe_titel+" eingeben");
			}
		}	
		return double_user_eingabe;
	}
	public void therapeutAufnahmeDialog() {
		aw.anstellen(new Therapeut(eingabe("Nachname"),eingabe("Vorname"), eingabe_int("Geburtsjahr")
				,eingabe_int("Ausbildungszeit") ,eingabe_double("Gehalt"),eingabe("Berufstitel") ,
				eingabe_double("Bonus")));
	}
	public void medAngestellteAufnahmeDialog() {		
		aw.anstellen(new MedAngestellte(eingabe("Nachname"), eingabe("Vorname"), eingabe_int("Geburtsjahr")
				, eingabe_int("Ausbildungszeit"),eingabe_double("Gehalt"),eingabe("Fachbereich")));
	}	
	public void writeAngestelltenlisteInFile() throws EmptyFilenameException,IOException{
		String filename = JOptionPane.showInputDialog(null,"Bitte einen Dateiname eingeben");
		if(filename==null) return ;
		while(filename.equals("")) {
			int wahl = JOptionPane.showConfirmDialog(null,"Dateiname ist leer ,Bitte einen gueltigen Dateiname eingeben!","Fehler",
					JOptionPane.YES_NO_OPTION);
			if(wahl==JOptionPane.NO_OPTION) {
				throw new EmptyFilenameException();
			}
			filename = JOptionPane.showInputDialog(null,"Bitte einen Dateiname eingeben");
			if(filename==null) return;
		}
		try(FileOutputStream fos = new FileOutputStream(new File(filename+".txt"))) {
			aw.zeigeAngestellte(fos);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
