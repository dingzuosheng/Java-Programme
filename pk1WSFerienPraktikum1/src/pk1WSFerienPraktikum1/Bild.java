package pk1WSFerienPraktikum1;

import java.util.Objects;

public class Bild extends Medium{
		private String ort;
		public Bild(String titel,int jahr,String ort) {
			super(titel,jahr);
			this.ort=ort;
		}
		public String getOrt() {
			return this.ort;
		}
		@Override
		public void druckDaten() {
			System.out.println("ID = "+super.getId()+" \""+this.getTitel()+"\""+" aufgenommen im Jahr "+ this.getJahr()+" in "+ getOrt());
		}
		public boolean equal(Object o) {
			if(!super.equals(o))
				return false;
			Bild b =(Bild) o;
			if(b.getOrt()!=this.getOrt())
				return false;
			return true;
		}
		public int hashCode() {
			return Objects.hash(super.hashCode(),ort);
		}
}
