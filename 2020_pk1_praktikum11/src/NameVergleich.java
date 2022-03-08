import java.util.Comparator;

public class NameVergleich implements Comparator<Angestellter>{

	@Override
	public int compare(Angestellter l, Angestellter r) {
		return l.getName().compareTo(r.getName());	
	}
	
}
