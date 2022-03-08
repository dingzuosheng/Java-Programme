import java.time.LocalDate;
import java.util.Objects;
public abstract class Medium {
       private static int anzahlMedien;
       private int id;
       private String titel;
       private int jahr;
       public Medium(String titel,int jahr) {
    	   id=anzahlMedien;
    	   anzahlMedien++;
    	   this.titel=titel;
    	   this.jahr=jahr;
       }
       public int getId() {
    	   return id;
       }
       public void setTitel(String titel) {
    	   this.titel=titel;
       }
       public void setJahr(int jahr) {
    	   this.jahr=jahr;
       }
       public String getTitel() {
    	   return this.titel;
       }
       public int getJahr() {
    	   return this.jahr;
       }
       public int alter() {
    	   return LocalDate.now().getYear()-this.getJahr();
       }
       public abstract void druckDaten();
       public boolean equals(Object o) {
    	   if(this==o) {
    		   return true;
    	   }
    	   if(o==null) {
    		   return false;
    	   }
    	   if(this.getClass()!=o.getClass()) {
    		   return false;
    	   }
    	   Medium m;
    	   m=(Medium)o;
    	   if(m.jahr!=this.jahr) {
    		   return false;
    	   }
    	   if(m.titel!=this.titel) {
    		   return false;
    	   }
    	   return true;
       }
       public int hashCode() {
    	   return Objects.hash(titel,jahr);
       }
}
