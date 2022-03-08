import java.util.Scanner;
public class Auswahl {
	
	public static void zeigeMenue() {
		System.out.println("(1) Zeige die 1. bis 7. eingegebene Zahl");
		System.out.println("(2) Zeige die achte eingegebene Zahl");
		System.out.println("(3) Zeige die neunte eingegebene Zahl");
		System.out.println("(4) Beende das Programm");
	}

	public static void main(String[] args) {
		int option;
		Scanner scanner=new Scanner(System.in);
		zeigeMenue();
		
		int zahl1=scanner.nextInt();
		int zahl2=scanner.nextInt();
		int zahl3=scanner.nextInt();
		int zahl4=scanner.nextInt();
		int zahl5=scanner.nextInt();
		int zahl6=scanner.nextInt();
		int zahl7=scanner.nextInt();
		int zahl8=scanner.nextInt();
		int zahl9=scanner.nextInt();
		do {
	       option=scanner.nextInt();
		if(0<option&&option<4)
		switch(option) {
		case 1:System.out.println(zahl1+""+zahl2+""+zahl3+""+zahl4+""+zahl5+""+zahl6+""+zahl7);
		       break;
		case 2:System.out.println(zahl8);
		       break;
		default: System.out.println(zahl9);
		}
		}while(option!=4);
		scanner.close();
	}

}
