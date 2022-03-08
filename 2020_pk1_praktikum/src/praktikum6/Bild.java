package praktikum6;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Objects;

public class Bild extends Medium implements Serializable{
	private static final long serialVersionUID = 1L;
	private String ort;
	public Bild(String titel, int jahr,String ort) {
		super(titel, jahr);
		this.ort=ort;
	}
	public String getOrt() {
		return this.ort;
	}
	public void setOrt(String ort) {
		this.ort=ort;
	}
	@Override
	public void druckeDaten(OutputStream stream) throws IOException{
		String ausgabe = "ID = "+this.getId()+" \""+this.getTitel()+"\""+" aufgenommen im Jahr "+this.getJahr()
		+" in "+this.getOrt()+"\n";
		PrintWriter pw = new PrintWriter(stream);
		pw.printf("%s%n", ausgabe);
		pw.flush();
	}
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		Bild b=(Bild) o;
		if(b.ort!=this.ort)
			return false;
		return true;
	}
	public int hashCode() {
		return Objects.hash(super.hashCode(),ort);
	}
 

	
	
}
