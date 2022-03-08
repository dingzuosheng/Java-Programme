import java.util.Scanner;

public class aufgabe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = 0;
		/*
		 * if(n>0) { for(int i=2;i<n;i++) { if(n%i==0) { System.out.print(i+" "); s++; }
		 * } System.out.println("\n"); if(s>0) {
		 * System.out.println(n+" ist keine Primzahl"); }else {
		 * System.out.println(n+" ist eine Primzahl"); }
		 */
		if (n > 0) {
			for (int j = 1; j <= n; j++) {
				s=0;
				for (int i = 1; i <= j; i++) {
					if (j % i == 0) {
						s++;
					}
				}
				if (s == 2) {
					System.out.print(j);
				}
			}

		}
		scanner.close();
	}

}
