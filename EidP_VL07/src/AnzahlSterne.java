
public class AnzahlSterne {
	public static void main(String[] args) {
		char felda [][] = {{'*','a','*'},{'*',' '},{'b','c','0','a'}};
		char feldb [][] = {{'*','a','*','a'},{'*','*','*','b'},{'b','c','0','c'}};
		berechneSterneProzeile(felda);
		berechneSternerProSpalte(feldb);
		berechneAnzahlZeilen(feldb);
		berechneAnzahlZeilen(felda);
		System.out.println(berechneAnzahlZeilen(feldb)+berechneAnzahlZeilen(felda));
	}

	public static void berechneSterneProzeile(char[][] felda) {	    
	    for(int z=0;z<felda.length;z++)  {
	    	int zaehler=0;    	
	    	for(int s=0;s<felda[z].length;s++) {
	    		if(felda[z][s]=='*') 
	    			zaehler++;
	    	}
	    	System.out.println("Zeile " + z + ": " + zaehler);
	    }		
	}
	public static void berechneSternerProSpalte(char[][] feldb) {
		for(int s=0;s<feldb[0].length;s++) {
			int zaehler=0;
			for(int z=0;z<feldb.length;z++) {
				if(feldb[z][s]=='*')
					zaehler++;
			}
			System.out.println("Spalte "+ s + ": " + zaehler );
		}		
	}
	public static int berechneAnzahlZeilen(char[][] feldb) {
		int ZeilenZaehler=0;
		for(int z=0;z<feldb.length;z++) {
			int zaehler=0;
			for(int s=0;s<feldb[z].length;s++) {
				if(feldb[z][s]=='*')
					zaehler++;
			}
			if(zaehler>=2) 
				ZeilenZaehler++;
		}
		System.out.println(ZeilenZaehler);
		return(ZeilenZaehler);
	}
}
	
