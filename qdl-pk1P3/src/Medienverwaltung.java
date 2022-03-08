import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {
       private Collection<Medium> m;
       private int anzMedien=0;
       public Medienverwaltung() {
    	   m=new LinkedList<Medium>();
       }
       public void aufnehmen(Medium medium) {
    	   m.add(medium);
    	   anzMedien++;
       }
       public void zeigeMedien() {
    	   for(Medium a:m) {
    		   a.druckDaten();
    	   }
       }
       public void sucheNeuesMedium() {
    	  int min;
    	  Medium neu;
    	  Iterator<Medium> it=m.iterator();
    	  while(it.hasNext()) {
    		  Medium medium=it.next();
    		  neu=medium;
    		  min=medium.alter();
    		  if(medium.alter()<min) {
    			  min=medium.alter();
    			  neu=medium;
    		  }
    		  neu.druckDaten();
    	  }	  
       }
       public double berechneErscheinungsjahr() {
    	   double durchschnitt=0;
    	   double summe=0;
    	   if(!m.isEmpty())
    	   for(Medium a:m) {
    		   summe+=a.alter();
    		   durchschnitt=summe/anzMedien;
    	   }else {
    		   durchschnitt=0.0;
    	   }
    	   return durchschnitt;
       }
       
}
