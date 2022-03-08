package Edip_VL05;
import java.util.Scanner;
public class Geldanlage {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int i;
		do {		
		i=scanner.nextInt();
		double n=scanner.nextDouble();	
		if(0<i&&i<6) {
		System.out.println("---------------------------------------------------");
		System.out.println("1    1.5% Verzinsung ohne Bonuszahlung");
		System.out.println("2    0.7% Verzinsung mit 15 Euro Bonuszahlung");
		System.out.println("3    0.4% Verzinsung mit 20 Euro Bonuszahlung");
		System.out.println("4    0.1% Verzinsung mit 50 Euro Bonuszahlung");
		System.out.println("5    Fertig");
		System.out.println("---------------------------------------------------");
		System.out.println(berechneKapital(i,n));		
		} else {
			System.out.println("Bitte waehlene Sie eine der Moeglichkeiten 1-5 aus");
		}
		}while(i!=5);		
		scanner.close();
	}
	public static double berechneKapital(int i,double n) {
		double Kapital=0;
		switch(i) {
		case 1:  Kapital=n*(1+1.5/100);
		         break;
		case 2:  Kapital=(n*(1+0.7/100)+15)*(1+0.7/100)+15;
		         break;
		case 3:  Kapital=((n*(1+0.4/100)+20)*(1+0.4/100)+20)*(1+0.4/100)+20;
		         break;
		case 4:  Kapital=(((n*(1+0.1/100)+50)*(1+0.1/100)+50)*(1+0.1/100)+50)*(1+0.1/100)+50;
		         break;
		
		}
		return Kapital;
	}

}
