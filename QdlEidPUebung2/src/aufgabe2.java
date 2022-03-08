import java.util.Scanner;
public class aufgabe2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int summe =0;
		int produkt=1;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				summe+=i;
				produkt*=i;
			}
			System.out.print("summe ist : "+summe+"; "+"produkt ist : "+produkt);
		}

	}

}
