
public class Raumverwaltung {
     private Raum[] derRaum=new Raum[100];
     int anzRaeume=0;
     
     public Raumverwaltung() {
    	 
     }
     public void addRaum(Raum raum) {  	 
    		 if(anzRaeume<derRaum.length) {
    			 derRaum[anzRaeume]=raum;
    			 anzRaeume++;
    		 }  	  
     }
     public void ausgabeRaumliste() {
    	 for(int i=0;i<anzRaeume;i++) {
    		 if(this.derRaum[i].getNutzer()!=null) {
    			 String ausgabe=this.derRaum[i].getTrakt()+"."+this.derRaum[i].getEtage()+"."+this.derRaum[i].getNummer()+":"
    					 +this.derRaum[i].getNutzer().getName();
    			System.out.println(ausgabe);
    		 }else {
    	    	 String ausgabe=this.derRaum[i].getTrakt()+"."+this.derRaum[i].getEtage()+"."+this.derRaum[i].getNummer()+":";
    	    	 System.out.println(ausgabe);
    		 }
    	 }
    	   
     }
     
}
