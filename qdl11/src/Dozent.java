
public class Dozent {
   private Vorlesung[] eineVorlesung=new Vorlesung[5];
   private int anzdieVorlesung=0;
   
   private String name;
	
   
   public Dozent(String name) {
	   this.name=name;
   }
   public String getName() {
	   return this.name;
   }
   public void removeName() {
	   this.name=null;
   }
   public boolean addVorlesung(Vorlesung vorlesung) {
	   if(anzdieVorlesung<eineVorlesung.length) {
		   this.eineVorlesung[anzdieVorlesung]=vorlesung;
		   anzdieVorlesung++;
		   return true;
	   }
	   return false;
   }
   public String toString() {
	   String c= name+"\n"+"Vorlesung:\n";
	 for(int i=0;i<anzdieVorlesung;i++) {
		 if(this.eineVorlesung[i]!=null) {
			 c+=this.eineVorlesung[i].getTitel();
		 }
		 
	 }
	    return c;  
   }
}
