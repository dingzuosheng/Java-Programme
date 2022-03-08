package praktikum3;

public class Main {

	public static void main(String[] args) {
		
		Liste<String> liste=new Liste<String>();	
		Link<String> mittleresElement=new Link<String>("Test",null);
		mittleresElement.naechster=new Link<String>("Letzter",null);
		Link<String> anfang=new Link<String>("Erster",mittleresElement);
		if(anfang!=null) {
		    liste.get(anfang);	
		}
		
		

	}

}
