
public class Student {
   private Vorlesung[] eineVorlesung=new Vorlesung[10];
   int anzdieVorlesung=0;
   private Dozent einDozent;
   
   
   private String name;
   
   
   public Student(String name) {
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
	   String a=name+"\n"+"Vorlesungen:\n";
	 for(int i=0;i<anzdieVorlesung;i++) {
		 if(this.eineVorlesung[i]!=null) {
			  a+=this.eineVorlesung[i].getTitel()+":"+einDozent;
		 }
	 }
	   return a;
   }
   
}
