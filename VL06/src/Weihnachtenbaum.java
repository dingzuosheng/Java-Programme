import java.util.Scanner;
public class Weihnachtenbaum {
	public static void main(String[] args) {
		Weihnachtenbaum.Sterne();
	}
	public static void Sterne() {
		Scanner scanner =new Scanner(System.in);
		int n =scanner.nextInt();
		String leerzeichen = "";
		String stern = "*";
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i+1;j++) {
				leerzeichen=" ";
			}
			for(int j=n-i+1;j<n+i;j++) {
				stern="*";
			}
		}
		System.out.println(stern);
		scanner.close();
	}

}
