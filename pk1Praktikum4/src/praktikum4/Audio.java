package praktikum4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;

public  class Audio extends Medium{
      private String interpret;
      private int dauer;
      public Audio(String titel,int jahr,String interpret,int dauer) {
    	  super(titel,jahr);
    	  this.interpret=interpret;
    	  this.dauer=dauer;
      }
      public void setInterpret(String interpret) {
    	  this.interpret=interpret;
      }
      public void druckeDaten(OutputStream stream) {
    	  PrintStream ps=new PrintStream(stream); 
    	  ps.printf("ID = %d /tt=%s/itp=%s/jahr=%d/dauer=%d",super.getId(),super.getTitel(),interpret,super.getJahr(),dauer);
    	  ps.flush();
      }
      public boolean equals(Object o) {
    	  if(!super.equals(o)) {
    		  return false;
    	  }
    	  Audio a;
    	  a=(Audio)o;
    	  if(a.interpret!=this.interpret) {
    		  return false;
    	  }
    	  if(a.dauer!=this.dauer) {
    		  return false;
    	  }
    	  return true;
    	  
      }
      public int hashCode() {
     	 return Objects.hash(super.hashCode(),interpret,dauer);	 
      }
}
