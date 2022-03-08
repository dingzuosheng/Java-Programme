import java.util.Scanner;
public class aufgbe1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t=0;
		if(n>=0) {
			t=n/2;
			while(t<n) {
				System.out.print(t+",");
				t++;
			}
			System.out.print(t);
		}else {
			t=n;
			while(t<-1) {
				System.out.print(t+",");
				t++;
			}
			System.out.print(t);
		}
		

	}

}
