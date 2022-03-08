package praktikum1;
import java.util.Scanner;
public class allePrimazahlenAusgeben {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] feld = new int[n];
	//	alleZahlenAufschreiben(n); //mit Methoden passen die beide Felder nicht ,deshalb gibt's keine Ausgabe;
		for(int i=0;i<n;i++) {
			feld[i]=i+1;
			System.out.print(feld[i]+" ");
		}		
	    feld[0]=0;
	    int i=2;
	    while(i*i<=n) {
	    	if(feld[i-1]!=0) {
	    		for(int j=2*i;j<=n;j=j+i) {
	    			feld[j-1]=0;
	    		}
	    		
	    	}
	    	i++;
	    }
	    System.out.println(" ");
	    for( i=0;i<n;i++) {
	    	if(feld[i]!=0) {
	    		System.out.print(feld[i]+" ");
	    	}
	    }
	    scanner.close();

	}
	public static void alleZahlenAufschreiben(int n) {
		int [] feld =new int [n];
		for(int i=0;i<n;i++) {
			feld[i]=i+1;
			System.out.print(feld[i]+" ");
		}		
	}
	
	
	
	
	

}
