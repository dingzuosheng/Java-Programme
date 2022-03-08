package Edip_VL08;

public class Muster1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		char oben='o';
		char unten='u';
		char zeichen='A';
		for(int z=0;z<3;z++) {
			int n=3+2*z;
			char[][] feld=new char [n][n];
			fuelleFeld(feld,oben,unten);
			fuellerOberesDreieck(feld,zeichen);
			spiegele(feld,zeichen);
			for( n=0;n<feld.length;n++) {
				for(int s=0;s<feld[n].length;s++) {
					System.out.print(feld[n][s]);
				}
				System.out.println();
			}
			System.out.println("---------------------------");
		}
	}
	public static  void fuelleFeld(char[][] feld,char oben,char unten) {
		for(int z=0;z<(feld.length-1)/2;z++) {
			for(int s=0;s<feld[0].length;s++) {
				 feld[z][s]=oben;
			}
		}		
		int z=(feld.length-1)/2;
		for(int s=0;s<feld[0].length;s++) {
			feld[z][s]='=';
		}
		for(z=(feld.length-1)/2+1;z<feld.length;z++) {
			for(int s=0;s<feld[0].length;s++) {
				feld[z][s]=unten;
			}
		}				
	}
	public static void fuellerOberesDreieck(char[][] feld,char zeichen) {
		for(int z=0;z<(feld.length-1)/2;z++) {			
			for(int s=0;s<feld[0].length;s++) { 
				if(z<s&&s<feld.length-z-1) 
					feld[z][s]=zeichen;	 
			}
		}
    }
	public static void spiegele(char[][]feld,char zeichen) {
		int test=0;
		for(int z=feld.length-1;z>feld.length/2;z--) {
			for(int s=0;s<feld[0].length;s++) {
				if(feld[test][s]==zeichen) {
					feld[z][s]=feld[test][s];
				}
			}
			test++;
         }
		
		
	}		
}
