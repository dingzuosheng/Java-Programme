
public class AnzahlSterne {

	public static void main(String[] args) {
		char[][] felda = {{'*','a','*'},{'*'},{'b','c',0,'a'}};
		char[][] feldb = {{'*','a','*','a'},{'*','*','*','b'},{'b','c','0','c'}};
		berechneSterneProZeile(felda);
		berechneSterneProSplate(feldb);
		berechneAnzahlZeilen(felda);
		berechneAnzahlZeilen(feldb);
	}
	public static void berechneSterneProZeile(char[][] felda) {
		for(int i=0;i<felda.length;i++) {
			int s=0;
			for(int j=0;j<felda[i].length;j++) {
			    if(felda[i][j]=='*') 
				    s++; 
			}
			System.out.println(i+":"+s);
		}	
	}
	public static void berechneSterneProSplate(char[][] feldb) {
		for(int j=0;j<feldb[0].length;j++) {
			int s=0;
		     for(int i=0;i<feldb.length;i++) {			      
			      if(feldb[i][j]=='*')
				     s++;
		     }
		     System.out.println("Spalte"+j+":"+s);
		}
	}
	public static void berechneAnzahlZeilen(char[][] feld) {
		int anzahlZeilen=0;
		for(int z=0;z<feld.length;z++) {
			int anzahl=0;
			for(int s=0;s<feld[z].length;s++) {
				if(feld[z][s]=='*') {
					anzahl++;			    
				}
			}
			if(anzahl>=2) {
				   anzahlZeilen++;
			}
		}
		System.out.println(anzahlZeilen);
	}

}
