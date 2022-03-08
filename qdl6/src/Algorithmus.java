import java.util.Scanner;
public class Algorithmus {
	Scanner scanner =new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	public static int alg(int a,int b) {
		int h;
	do {
		h=a%b;
		a=b;
		b=h;
	}while (b!=0);
	return a;
	}

}