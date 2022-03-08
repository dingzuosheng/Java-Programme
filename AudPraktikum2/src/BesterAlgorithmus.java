import java.util.Scanner;
public class BesterAlgorithmus{
			// 1000n
			public static double g1(int n)
			{
				double erg=1000*n;
				System.out.	println(erg);
				return erg;
			}

			// 100n * log2(n+1)
			public static double g2(int n)
			{
				double erg;
				erg=100*n*(Math.log10(n+1)/Math.log10(2));
				System.out.	println(erg);
				return erg;
			}

			// 10 * n * n
			public static double g3(int n)
			{
				double erg;
				erg=10*n*n;
				return erg;
			}

			// n * n * n
			public static double g4(int n)
			{
				double erg;
				erg=(double)n*n*n;
				return erg;
			}

			// 2 hoch n
			public static double g5(int n)
			{ 
				double erg;
				erg=Math.pow(2.0,n);
				return erg;
			}

			// n!
			public static double g6(int n)
			{
				double erg=1.0;
				for(int i=1;i<=n;i++) {
					erg*=i;
				}
				return erg;
			}

			// Bestimmt fuer alle 6 Funktionen den Wert von
			// gi(n) und gibt den Index der Funktion mit
			// dem minimalen Wert zurueck
			public static int gewinnerFuerN(int n)
			{
				int index=-1;
				double min=g1(n);
				double[] feld = {g2(n),g3(n),g4(n),g5(n),g6(n)};
				for(int i=0;i<5;i++) {
					if(feld[i]<min) {
						min=feld[i];
						index=i;
					}
				}
				if(index>=0&&index<=4) {
				return index+2;
				}else {
					return 1;
				}
				
			}

			// Gibt fuer jede Zahl n zwischen 1 und 2000 aus, welcher der
			// 6 Algorithmen (A1 .. A6) fuer das betrachtete n der Beste ist
			public static void main(String[] args)
			{
				Scanner scanner = new Scanner(System.in);
				int n ;			
					
				do {
					 System.out.println("Bitte ein natuerlich Zahl zwischen 1 und 2000 eingeben: ");
					 n = scanner.nextInt();					 
					 System.out.println("Das beste Algorithmus fuer das betrachtes "+n+" ist :");
					 System.out.println(gewinnerFuerN(n));
					 
					 
				}while(n>=1&&n<=2000);
				
				scanner.close();
			}
		

}


