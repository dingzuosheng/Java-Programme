import java.util.Scanner;
public class aufgabe1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(IsPrim(n));
		allPrims(n);
        scanner.close();
	}
	public static boolean IsPrim(int n) {
		boolean erg=true;
		if(n>1) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					erg=false;
				}
			}
		}
		return erg;
	}
	public static void allPrims(int n) {
		while(n>=2) {
			if(IsPrim(n)==true) {
				System.out.print(n+" ");	
			}
			n--;
		}
	}
	

}
