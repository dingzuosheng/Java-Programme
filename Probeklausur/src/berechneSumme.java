
public class berechneSumme {

	public static void main(String[] args) {
		
	}
    public static int berechneSumme( int[] feld) {
		int i=0;
		int summe=0;
		while(i<feld.length) {
			summe+=feld[i];
			i++;
		}
       return summe;
    }
    public static int laengeDezimalDarstellung(int n) {
    	int laenge = 1;
    	while(n>9) {
    		laenge++;
    		n=n/10;
    	}
    	return laenge;
    }
    public static int[] dezimalDarstellung(int n) {
    	int[] feld =new int[laengeDezimalDarstellung(n)];   	
    		int p=1;
    		while(laengeDezimalDarstellung(n)>1) {
    			p*=10;
    		}
    		int i=0;
    		while(i<feld.length) {
    		feld[i]=n/p;
    		n=n-feld[i]*p;
    		p=p/10;
    		i++;
    	    }
    	return feld;
    }

   public static int quersummer(int n) {
	   int[] feld =new int[laengeDezimalDarstellung(n)];
	   int summe=0;
	   for(int i=0;i<feld.length;i++) {
		   summe+=feld[i];
	   }
	   return summe;
   }
}
