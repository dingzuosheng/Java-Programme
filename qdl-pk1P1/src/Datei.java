
public class Datei extends DateiSystemEintraege{
	
	public Datei(String name) {
		super(name);
	}

	@Override
	void open() {
	}
	@Override
	void print(int einrueckung) {
		for(int i=einrueckung;i>0;i--) {
			System.out.print("-");
		}
		System.out.print(this.getName());	
	}

	@Override
	public int compareTo(DateiSystemEintraege arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
