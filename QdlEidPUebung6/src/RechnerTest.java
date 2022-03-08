import java.util.Scanner;

public class RechnerTest {
	public static void printMenue() {
		System.out.println("-------------");
		System.out.println("1. Bruch  eingeben");
		System.out.println("2. Potenz eingeben");
		System.out.println("3. Alles  addieren");
		System.out.println("4. Alles  multiplizieren");
		System.out.println("5. Abbrechen");
	}
	

	public static void main(String[] args) {
	 	Scanner scanner =new Scanner(System.in);
	
	 	Rechner r=new Rechner(scanner);
     	int n;
        do {
        	printMenue();
        	n=scanner.nextInt();
        	switch(n) {
        	case 1: System.out.println("1. Bruch  eingeben");
        			r.add(r.liesBruch());
        	        break;
        	case 2: System.out.println("2. Potenz eingeben");
        	  		r.add((r.liesPotenz()));
        	        break;
        	case 3: System.out.println("3. Alles  addieren");
        			System.out.println(r.verknuepfeAlle("+")+"="+r.addiereAlle());
        	        break;
        	case 4: System.out.println("4. Alles  multiplizieren");
        			System.out.println(r.verknuepfeAlle("*")+"="+r.multipliziereAlle());
        			break;
        	case 5: break;
        	}
        }while(n!=6);
        scanner.close();
	}

}
