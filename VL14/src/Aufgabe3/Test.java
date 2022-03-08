package Aufgabe3;
public class Test {

	public static void main(String[] args) {
		Computer einComputer1= new Computer("Ryzen",1000);
		Computer einComputer2=new Laptop("Apple",2000,123.0f);
		
		Datei einDatei1= new Textdatei("td",2);
		Datei einDatei2=new Bilddatei("bd",10,20);
		
		einComputer1.addDatei(einDatei1);
		einComputer2.addDatei(einDatei2);	
		
		einComputer1.ausgebenDateiliste();
		einComputer2.ausgebenDateiliste();
		
		
		if(einComputer2 instanceof Laptop) {
			System.out.println("die Bildschirmdiagonale des Laptops ist : "+((Laptop) einComputer2).getBildschirmdiagonale());
		}		
      
	}

}
