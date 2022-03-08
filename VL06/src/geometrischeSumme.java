import java.util.Scanner;
public class geometrischeSumme {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int q=scanner.nextInt();
		double erg=1;
		double summe=0;
		for(int i=0;i<=n;i++) {
			erg*=q;
			summe+=erg;
		}
		System.out.println(summe);
		scanner.close();
	}
}
