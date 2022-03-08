package pk1Praktikum;

import java.util.Objects;

public  class Bild extends Medium {
 private String ort;
 
 public Bild(String titel,int jahr,String ort) {
	 super(titel,jahr);
	 this.ort=ort;
 }
 public void druckeDaten() {
	  System.out.println("ID = "+super.getId()+" \" "+super.getTitel()+" \"   aufgenommen im Jahr "+super.getJahr()+ort);
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
