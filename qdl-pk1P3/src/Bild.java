import java.util.Objects;

public class Bild extends Medium{
      private String ort;
      
      public Bild(String titel,int jahr,String ort) {
    	  super(titel,jahr);
    	  this.ort=ort;
      }
      public void setOrt(String ort) {
    	  this.ort=ort;
      }
      public String getOrt() {
    	  return this.ort;
      }

	@Override
	public void druckDaten() {
		System.out.println("ID = "+super.getId()+" "+super.getTitel()+" aufgenommen im Jahr "+super.getJahr()
		      +" in "+this.getOrt());
		
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) {
			return false;
		}
		Bild b=(Bild) o;
		if(b.ort!=this.ort) {
			return false;
		}
		return true;
	}
	public int hashCode() {
		return Objects.hash(super.hashCode(),ort);
	}
      
}
