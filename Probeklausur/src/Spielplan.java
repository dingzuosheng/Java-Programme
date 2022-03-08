import java.util.Scanner;
public class Spielplan {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int punkteDeutschland = 0;
		int punkteItalien = 0;
		int punkteNiederlande = 0;
		System.out.println("(1)  Italien - Niederlande ");
		int i=scanner.nextInt();
		int n=scanner.nextInt();
		if(i>n) {
			punkteItalien+=3;
		} else {
			 if(i==n) {
				 punkteItalien++;
				 punkteNiederlande++;
			 } else {
				 punkteNiederlande+=3;
			 }
		}
		System.out.println("(2)  Italien - Deutschland ");
		i=scanner.nextInt();
		int d=scanner.nextInt();
		if(i>d) {
			punkteItalien+=3;
		} else {
			 if(i==d) {
				 punkteItalien++;
				 punkteDeutschland++;
			 } else {
				 punkteDeutschland+=3;
			 }
		}
		System.out.println("(3)  Niederlande - Deutschland ");
		n=scanner.nextInt();
		d=scanner.nextInt();
		if(n>d) {
			punkteNiederlande+=3;
		} else {
			 if(n==d) {
				 punkteNiederlande++;
				 punkteDeutschland++;
			 } else {
				 punkteDeutschland+=3;
			 }
		}
       System.out.println(" Italien "+ punkteItalien );
       System.out.println(" Niederlande "+ punkteNiederlande );
       System.out.println(" Deutschland  "+ punkteDeutschland );
       scanner.close();
	}
	
}
