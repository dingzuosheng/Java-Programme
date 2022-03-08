
public class Test {

	public static void main(String[] args) {
		Ordner o1=new Ordner("Ordner 1");
		Ordner o2=new Ordner("Ordner 2");
		Ordner o3=new Ordner("Ordner 3");
		Datei  d1=new Datei("Datei 1");
		Datei  d2=new Datei("Datei 2");
		Datei  d3=new Datei("Datei 3");
		Datei  d4=new Datei("Datei 4");
		o1.aufnehmen(o2);
		o1.aufnehmen(o3);
		o1.aufnehmen(d3);
		o1.aufnehmen(d4);
		
		o2.aufnehmen(d1);
		o2.aufnehmen(d2);
		o1.print(3);
	}

}
