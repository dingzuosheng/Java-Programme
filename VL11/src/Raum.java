
public class Raum {
   private Professor derNutzer;
   
   public void setNutzer(Professor prof) {
	   this.derNutzer=prof;
   }
   public Professor getNutzer() {
	   return this.derNutzer;
   }
   public void removeNutzer() {
	   this.derNutzer=null;
   }
   
   
   private char trakt;
   private char etage;
   private String nummer;
   
   
   public Raum(char trakt,char etage,String nummer) {
	   this.trakt=trakt;
	   this.etage=etage;
	   this.nummer=nummer;
   }
   public char getTrakt() {
	   return this.trakt;
   }
   public char getEtage() {
	   return this.etage;
   }
   public String getNummer() {
	   return this.nummer;
   }
   
}
