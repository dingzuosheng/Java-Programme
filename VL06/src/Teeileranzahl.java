import java.util.Scanner; 
public class Teeileranzahl {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int a;
		do {
	    System.out.println("------------------------------------------------------");
        System.out.println("1     Teileranzahl fuer n");
        System.out.println("2     Maximale Teileranzhal fuer die Zahlen 1 bis n");
        System.out.println("3     Fertig");
        System.out.println("------------------------------------------------------");
        a=scanner.nextInt();
	    int n=scanner.nextInt();
	    if(0<a&&a<3) {
           if(n>=0) {
        	   switch (a) {
        	   case 1: berechneTeileranzahl(n);
        	           break;
        	   case 2: berechneMaximaleTeileranzahl(n);
        	           break;
        	   }
        	
           }else {
        	   System.out.println("Bitte geben Sie eine positive Zahl aus");
	       }
	    }else {
	    	System.out.println("Bitte geben Sie eine Zahl im Bereich 1-3 aus");
	    }
		} while(a!=3);
	}
	public static void berechneTeileranzahl(int n) {
		int summe=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				summe=summe+1;
			}
		}	
	}
	public static void berechneMaximaleTeileranzahl(int n) {
		int summe=0;
		int Maxi=0;
		if(n>0) {
		berechneTeileranzahl(n);
		if(summe>Maxi) {
			Maxi=summe;
		}
		n--;
		}
		
		System.out.println(Maxi);
	}
	
}

