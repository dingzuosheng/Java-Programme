import java.util.Scanner;
public class Teilanzahl {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a;
		int n;
	    do {
		System.out.println("Bitte ein natuerlich Zahl eingeben: ");
		 n=scanner.nextInt();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("1      Teileranzahl fuer n");
		System.out.println("2      Maximale Teileranzahl fuer die Zahlen 1 bis n");
		System.out.println("3      Fertig");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Bitte zuerst ein Auswahl eingeben: ");
		 a=scanner.nextInt();
		if(0<a&&a<=3) {
			switch(a) {
			case 1:   System.out.println("Teileranzahl fuer n ist :");
			          System.out.println(berechneTeileranzahl(n));
			          break;
			case 2:   System.out.println("Maximale Teileranzahl fuer die Zahlen i bis n ist :");
				      System.out.println(berechneMaximaleTeileranzahl(n));
			          break;
			default:  break;
			}
		} else {
			System.out.println("Bitte ein Auswahl zwischen 1 und 3 eingeben :");
		}
		
	    }while(a!=3&&n>0);

	}
	public static int berechneTeileranzahl(int n) {
		int teileranzahl=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				teileranzahl++;
			}
		}
		return teileranzahl;
	}
	public static int berechneMaximaleTeileranzahl(int n) {
		int max=0;
		do {
			if(berechneTeileranzahl(n)>max)
			max=berechneTeileranzahl(n);
			n--;
		}while(n>0);
		return max;
	}

}
