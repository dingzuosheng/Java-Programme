package pk1Praktikum6;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Artikel a= new Artikel("040984",300.0);
      Werbung w=new Werbung();
      a.addlistener(w);
      a.setPreis(200.0);
      //a.removeListener(w);
      a.setPreis(0);
	}

}
