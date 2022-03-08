import java.util.Scanner;
public class aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double b=scanner.nextDouble();
		int e=scanner.nextInt();
		double p=1;
		if(b>=0&&e>0) {
			for(int i=0;i<e;i++) {
				p*=b;
			}
			System.out.println(p);
		}
		if(b>=0&&e==0) {
			System.out.println(p=1);
		}
       scanner.close();
	}

}
