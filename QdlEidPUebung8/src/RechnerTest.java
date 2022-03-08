import java.util.Scanner;

public class RechnerTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Rechner r= new Rechner(s);
//		System.out.println(r.liesAusdruck());
		r.liesEingabe();
        r.liesUndSpeichereAusdruck();
		r.gibtAusdrueckeAus();
		r.addiereAlle();
		r.multipAlle();
		r.maxi();
	}

}
