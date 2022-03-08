
public class aufgabe3 {

	public static void main(String[] args) {
		System.out.println(Ulam(50));

	}
	public static int Ulam(int n) {
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
			}else {
				n=3*n+1;
			}
		}
		return 1;
	}

}
