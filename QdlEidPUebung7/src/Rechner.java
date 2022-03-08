import java.util.Scanner;

public class Rechner {
       
       Scanner scanner;
       Ausdruck[] a=new Ausdruck[100];
       int anzAusdruck=0;
       public Rechner(Scanner scanner) {
    	   this.scanner=scanner;
       }
       public void add(Ausdruck ad) {
    	if(anzAusdruck<a.length) {
    		a[anzAusdruck++]=ad;
    	}
       }
       public String verknuepfungAlle(String verknuepfung) {
    	   String str="";
    	   boolean erstes=true;
    	   for(int i=0;i<anzAusdruck;i++) {
    		   if(erstes)
    			   erstes=false;
    		   else 
    			   str+=verknuepfung;
    		   str+=a[i];
    	   }
    	   return str;
       }
       public Ausdruck addiereAlle() {
    	   Ausdruck erg=new IntZahl(0);
    	   for(int i=0;i<anzAusdruck;i++) {
    		    erg=erg.addiere(a[i]); 
    	   }
    	   return erg;
       }
       public Ausdruck multipliziereAlle() {
    	   Ausdruck erg=new IntZahl(1);
    	   for(int i=0;i<anzAusdruck;i++) {
    		   erg=erg.multipliziere(a[i]);
    	   }
    	   return erg;
       }
       public Ausdruck liesAusdruck() {
    	   System.out.println("Ausdruck eingeben");
    	   int n;
    	   Ausdruck a=new IntZahl(0);
    	   do {
    		   printMenu();
    		   n=scanner.nextInt();
    		   switch(n) {
    		   case 1: System.out.println("1: Integer eingeben");
    		          a=new IntZahl(scanner.nextInt()); 
    		          break;
    		   case 2: System.out.println("2: Double  eingeben");
    		          a=new DoubleZahl(scanner.nextDouble());
    		          break;
    		   case 3: System.out.println("3: Bruch   eingeben");
    		          a=new Bruch(liesAusdruck(),liesAusdruck());
    		          break;
    		   case 4: System.out.println("4: Potenz  eingeben");
    		          a=new Potenz(scanner.nextInt(),liesAusdruck());
    		          break;
    		   }
    	   }while(n!=5);
    	   return a;
       }
       public void printMenu() {
    	   System.out.println("1: Integer eingeben");
    	   System.out.println("2: Double  eingeben");
    	   System.out.println("3: Bruch   eingeben");
    	   System.out.println("4: Potenz  eingeben");
       }
      
}
