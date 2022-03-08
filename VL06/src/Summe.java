import java.util.Scanner;
public class Summe {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int summe=0;
		for(int i=1;i<=n;i++) {
			summe=summe+i*i;
			
		}
		System.out.print(summe);
	}

}
