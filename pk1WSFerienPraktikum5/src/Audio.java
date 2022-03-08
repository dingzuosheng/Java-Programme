import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Objects;

public class Audio extends Medium{
	private String interpret;
	private int dauer;
	public Audio(String titel,int jahr,String interpret,int dauer) {
		super(titel,jahr);
		this.interpret=interpret;
		this.dauer=dauer;
	}
	public String getInterpret() {
		return this.interpret;
	}
	public int getDauer() {
		return this.dauer;
	}
	public boolean equal(Object o) {
		if(o==this)
			return true;
		if(o==null)
			return false;
		if(o.getClass()!=this.getClass())
			return false;
		/*if(!super.equals(o))
			return false;
		*/
		Audio a;
		a = (Audio) o;
		if(a.getInterpret()!=this.getInterpret())
			return false;
		if(a.getDauer()!=this.getDauer())
			return false;
		return true;
	}
	public int hashCode() {
		return Objects.hash(super.hashCode(),interpret,dauer);
	}
	@Override
	public int compareTo(Object o) {
		return this.compareTo(o);
	}
	@Override
	public void druckDaten(OutputStream stream) throws IOException {
		String str="ID = "+super.getId()+" \""+this.getTitel()+"\""+" von "+this.getInterpret()+" aus "+
				this.getJahr()+" Spieldauer: "+getDauer()+" sek.";
		OutputStreamWriter os=new OutputStreamWriter(stream);
		os.write(str.toCharArray());
	}
	
	
}
