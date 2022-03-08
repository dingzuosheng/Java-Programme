package praktikum3;

public class Link<String> {
     public String daten;
     public Link<String> naechster;
     
     public Link(String daten,Link<String>naechster) {
    	 assert(daten !=null);
    	 this.daten=daten;
    	 this.naechster=naechster;
     }
     public void setDaten(String daten) {
    	 this.daten=daten;
     }
     public String getDaten(String daten) {
    	 return daten;
     }
     public void setNaechster(Link<String> naechster) {
    	 this.naechster=naechster;
     }
     public Link<String> getNaechster(Link<String> naechster){
    	 return naechster;
     }
}
