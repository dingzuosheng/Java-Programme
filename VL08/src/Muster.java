
public class Muster {

	public static void main(String[] args) {
		char oben='o';
		char unten='u';
		char zeichen='A';
		char [][]feld1=new char[5][5];
		fuelleFeld(feld1, oben, unten);
		for(int i=0;i<feld1.length;i++) {
			for(int j=0;j<feld1[0].length;j++) {
				System.out.print(feld1[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		char [][]feld2=new  char[7][7];
		fuelleFeld(feld2, oben, unten);
		fuelleOberesDreieck(feld2,zeichen);
		for(int i=0;i<feld2.length;i++) {
			for(int j=0;j<feld2[0].length;j++) {
				System.out.print(feld2[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		fuelleFeld(feld2, oben, unten);
		fuelleOberesDreieck(feld2,zeichen);
		spiegele(feld2 ,zeichen);
		for(int i=0;i<feld2.length;i++) {
			for(int j=0;j<feld2[0].length;j++) {
				System.out.print(feld2[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		for(int n=1;n<5;n++) {
			int z=2*n+1;
			char [][] feld=new char[z][z];
			test(feld,oben,unten,zeichen);
			System.out.println("-------------------------------------------------");
		}
		
	}
	public static void fuelleFeld(char[][]feld,char oben,char unten) {
          
          int i;
          for( i=0;i<feld.length/2;i++) {
        	  for(int j=0;j<feld[0].length;j++) {
        	   feld[i][j]=oben;
        	  }
          }
        	  i=feld.length/2;
        		  for(int j=0;j<feld[0].length;j++) {
        			  feld[i][j]='=';
        		  }      	  
        	  for( i=feld.length/2+1;i<feld.length;i++) {
        		  for(int j=0;j<feld[0].length;j++) {
        			  feld[i][j]=unten;
        		  }
        	  }        
	}
	public static void fuelleOberesDreieck(char[][] feld,char zeichen) {
		for(int i=0;i<feld.length/2;i++) {
			for(int j=i+1;j<feld[0].length-1-i;j++) {
				feld[i][j]=zeichen;
			}
		}	
	}
	public static void spiegele(char [][]feld ,char zeichen) {
		for(int i=feld.length-1;i>feld.length/2;i--) {
			for(int j=feld[0].length-i;j<i;j++) {
				feld[i][j]=zeichen;
			}
		}
	}
	public static void test(char[][]feld ,char oben,char unten,char zeichen) {		
			fuelleFeld(feld, oben, unten);
			fuelleOberesDreieck(feld,zeichen);
			spiegele(feld,zeichen);
			for(int i=0;i<feld.length;i++ ) {
				for(int j=0;j<feld[0].length;j++) {
					System.out.print(feld[i][j]);
				}
				System.out.println();	
			}
	}
}
