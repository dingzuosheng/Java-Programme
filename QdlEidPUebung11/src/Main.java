
public class Main {

	public static void main(String[] args) {
		System.out.println(quersumme(123456));

	}
	public static String quersumme(int n) {
		String str="";
		int s=0;
		while(n>9) {
			int m=n%10;
			n/=10;
			s+=m;
			str="+"+m+str;
		}
		s+=n;
		return n+str+"="+s;
	}

}
