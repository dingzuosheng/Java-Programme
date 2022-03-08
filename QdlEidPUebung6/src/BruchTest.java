
public class BruchTest {

	public static void main(String[] args) {
		Bruch b1=new Bruch(30,60);
		Bruch b2=new Bruch(20,40);
		System.out.println(b1.toString());
		System.out.println(b1.zuDouble());
		System.out.println(b1.umkehr());
		b1.kuerz();
		System.out.println(b2.toString());
		System.out.println(b2.zuDouble());
		System.out.println(b2.umkehr());
		b2.kuerz();
		System.out.println(b1.addiere(b2));
		System.out.println(b1.multipliziere(b2));
		System.out.println(b1.equal(b2));
		
	}

}
