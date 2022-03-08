package pk1Praktikum;

public class Medienverwaltung {
	 int n;
     private Medium[] m=new Medium[n];
     private int  anzMedien=0;
     public void aufnehmen(Medium einMedium) {
    	 if(anzMedien<m.length) {
    		 m[anzMedien]=einMedium;
    		 anzMedien++;
    		 if(anzMedien>m.length) {
    			 System.out.println("Die Array ist schon voll ");
    		 }
    	 }
     }
     public void zeigeMedien() {
    	 for(int i=0;i<anzMedien;i++) {
    		 if(m[i]!=null) {
    			 System.out.println(m[i]);
    		 }
    	 }
     }
     public void sucheNeuesMedium() {
    	 int min=m[0].alter();
    	 int index=0;
    	 for(int i=1;i<=anzMedien;i++) {
    		 if(m[i].alter()<min) {
    			 min=m[i].alter();
    			 index=i;
    		 }
    	 }
    	  	 m[index].druckeDaten();
     }
     public double berechneErscheinungsjahr() {
    	 double durchschnitt=0.0;
    	 int summe=0;
    	 if(anzMedien!=0) {
    	   for(int i=0;i<anzMedien;i++) {
    		 summe+=m[i].alter();	 
    	   }
    	   durchschnitt=summe/anzMedien;
    	 } else {
    		 durchschnitt=0.0;
    	 }
    	 return durchschnitt;
     }
    
    
}
