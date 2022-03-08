
public class Muster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		char oben='o';
		char unten='u';
		char zeichen='A';
		char[][] feld=new char [5][5];
		char [][] feld2=new char [7][7];
		char[][] feld3=new char [3][3];
		fuelleFeld(feld,oben,unten);
		System.out.println("------------------------------------");
		fuelleFeld(feld3,oben,unten);//test mit 3x3;
		System.out.println("------------------------------------");
		fuelleFeld(feld2,oben,unten);//test mit 7x7;
		System.out.println("------------------------------------");
		fuellerOberesDreieck(feld2,zeichen);
		System.out.println("------------------------------------");
		fuellerOberesDreieck(feld,zeichen);//test mit 5x5;
		System.out.println("------------------------------------");
		fuellerOberesDreieck(feld3,zeichen);//test mit 3x3;
		System.out.println("------------------------------------");
		spiegele(feld2, zeichen);
		System.out.println("------------------------------------");
		spiegele(feld,zeichen);//test mit 5x5;
		System.out.println("------------------------------------");
		spiegele(feld3,zeichen);//test mit 3x3;	
		System.out.println("------------------------------------");
	}
	public static  void fuelleFeld(char[][] feld,char oben,char unten) {
		for(int z=0;z<(feld.length-1)/2;z++) {
			for(int s=0;s<feld[0].length;s++) {
				 feld[z][s]=oben;
			 System.out.print(feld[z][s]); 
			}
			 System.out.println();
		}		
		int z=(feld.length-1)/2;
		for(int s=0;s<feld[0].length;s++) {
			feld[z][s]='=';
			System.out.print(feld[z][s]);
		}
		   System.out.println();
		for(z=(feld.length-1)/2+1;z<feld.length;z++) {
			for(int s=0;s<feld[0].length;s++) {
				feld[z][s]=unten;
				System.out.print(feld[z][s]); 
			}
			System.out.println();
		}				
	}
	public static void fuellerOberesDreieck(char[][] feld2,char zeichen) {
		for(int z=0;z<(feld2.length-1)/2;z++) {			
			for(int s=0;s<feld2[0].length;s++) { 
				if(z<s&&s<feld2.length-z-1) 
					feld2[z][s]=zeichen;				
				else 
				 feld2[z][s]='0';
				 System.out.print(feld2[z][s]);   
			}
			System.out.println();
		}
		int z=(feld2.length-1)/2;
		for(int s=0;s<feld2[0].length;s++) {
			feld2[z][s]='=';
			System.out.print(feld2[z][s]);
		}
		System.out.println();
		for(z=(feld2.length-1)/2+1;z<feld2.length;z++) {
			for(int s=0;s<feld2[0].length;s++) {
				feld2[z][s]='u';
				System.out.print(feld2[z][s]); 
			}
			System.out.println();
         }
    }
	public static void spiegele(char[][]feld2,char zeichen) {
		for(int z=0;z<(feld2.length-1)/2;z++) {			
			for(int s=0;s<feld2[0].length;s++) { 
				if(z<s&&s<feld2.length-z-1) 
					feld2[z][s]='A';				
				else 
				 feld2[z][s]='o';
				 System.out.print(feld2[z][s]);   
			}
			System.out.println();
		}
		int z=(feld2.length-1)/2;
		for(int s=0;s<feld2[0].length;s++) {
			feld2[z][s]='=';
			System.out.print(feld2[z][s]);
		}
		System.out.println();
		for(z=(feld2.length-1)/2+1;z<feld2.length;z++) {
			for(int s=0;s<feld2[0].length;s++) {
				if(feld2.length-z<=s&&s<=z-1)
				feld2[z][s]='A';
				else
				feld2[z][s]='u';
				System.out.print(feld2[z][s]); 
			}
			System.out.println();
         }
	}	
}
