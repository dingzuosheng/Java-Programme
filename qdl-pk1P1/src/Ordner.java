import java.util.ArrayList;
public class Ordner extends DateiSystemEintraege{
         
     private ArrayList<DateiSystemEintraege> l;
     
     public Ordner(String name) {
    	 super(name);
    	
     }
	@Override
	void open() {
	}
    void aufnehmen(DateiSystemEintraege eintrag) {
		  l.add(eintrag);
	}
    @Override
	void print(int einrueckung) {
    	int s=l.size();
		if(s==0) {System.out.print(this.getName());}
		else {
			for(int i=0;i<s;i++) {
				if(l.get(i) instanceof Ordner) {
					l.get(i).print(einrueckung);
				}else {
					l.get(i).getName();
				}
			}
		}	
	}
    public int compareTo(DateiSystemEintraege d) {
       int i=0; 
       int s=l.size();
       if(s==0) {i=0;}
       else {
    	   for(DateiSystemEintraege o :l) {
    		   if(o instanceof Ordner) {
    			   o.compareTo(d);
    		   }else {
    			   if(o.getName().compareTo(d.getName())==0) {
    				   i=0;
    			   }if(o.getName().compareTo(d.getName())>0) {
    				   i=1;
    			   }if(o.getName().compareTo(d.getName())<0) {
    				   i=-1;
    			   }
    		   }
    	   }
       }
       return i;
    }
}
