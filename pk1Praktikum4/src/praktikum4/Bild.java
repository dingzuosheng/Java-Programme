package praktikum4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;

public  class Bild extends Medium {
 private String ort;
 
 public Bild(String titel,int jahr,String ort) {
	 super(titel,jahr);
	 this.ort=ort;
 }
 public void druckeDaten(OutputStream stream) {
	  PrintStream ps= new PrintStream(stream);
	  ps.printf("ID=%d/titel=%s/jahr=%d/ort=%s",super.getId(),super.getTitel(),super.getJahr(),ort);
	  ps.flush();
 }
 public boolean equals(Object o) {
	 if(!super.equals(o)) {
		 return false;
	 }
	 Bild b;
	 b=(Bild)o;
	 if(b.ort!=this.ort) {
		 return false;
	 }
	 return true;
 }
 public int hashCode() {
	 return Objects.hash(super.hashCode(),ort); 
 }
}
