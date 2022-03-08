import javax.management.RuntimeErrorException;
                         
public class Liste<String> {
Link<String> start;
Link<String> end;
Link<String> zeiger;
Link<String> vorgaenger;
   int size;
   public void anfuegen(final String daten) {
	   if(start==null) {
		   start=end=new Link<String>(daten, null);
		   start.daten=daten;
	   }else {
		   end.naechster=new Link<String>(daten,null);
		   end.naechster.daten=daten;
		   end=end.naechster;
	   }
   }
   public int size() {
	   int count=0;
	   Link l= start;
	   while(l!=null) {
		   count++;
		   l=l.naechster;
	   }
	   return count;
   }
   public void get(Link<String> anfang) {
	  if(anfang!=null) {
	   Link<String> l=start;
	   for(int i=0;i<size();i++) {
		   l=l.naechster;
	   }
       System.out.println(l.daten);
	  }
}
}
