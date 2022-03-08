import java.util.Scanner;

public class RechnerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 Rechner r=new Rechner(scanner);
		 int n;
		 do {
			 printMenu();
			 n=scanner.nextInt();
			 switch(n) {
			 case 1: System.out.println("1. Ausdruck");
			         r.add(r.liesAusdruck());
			         break;
			 case 2: System.out.println("2. Alles addieren");
			         System.out.println(r.verknuepfungAlle("+")+"="+r.addiereAlle());
			         break;
			 case 3: System.out.println("3. Alles multiplizieren");
			 		 System.out.println(r.verknuepfungAlle("*")+"="+r.multipliziereAlle());
			         break;
			 }
		 }while(n!=4);
           
	}
	 public static void printMenu() {
  	   System.out.println("1. Ausdruck");
  	   System.out.println("2. Alles addieren");
  	   System.out.println("3. Alles multiplizieren");
  	   System.out.println("4. Abbrechen");
     }

}
