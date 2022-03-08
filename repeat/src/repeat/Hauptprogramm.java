package repeat;

public class Hauptprogramm {

	public static void main(String[] args) {
		System.out.println("5 * 5 = "+Mathe.quadrat(5));
		int[] zahl= {1,2,3};
		System.out.println(Statistik.mean(zahl));
	}
}
