import java.util.Scanner;
public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		do {
			System.out.println(m);
			m-=2;
		}while(m>0);
		scanner.close();

	}

}
