
public class PotenzTest {

	public static void main(String[] args) {
		Potenz p1=new Potenz(3,new Bruch(3,5));
		Potenz p2=new Potenz(3,new Bruch(2,4));
		System.out.println(p1.toString());
		System.out.println(p1.zuDouble());
		System.out.println(p1.zuBruch());
		System.out.println(p2.toString());
		System.out.println(p2.zuDouble());
		System.out.println(p2.zuBruch());
		System.out.println(p1.multipliziere(p2));
       
	}

}
