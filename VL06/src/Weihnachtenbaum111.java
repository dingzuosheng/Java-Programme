import java.util.Scanner;
public class Weihnachtenbaum111 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String s="";
		String l="";
		int n=scanner.nextInt();
		int anzL=0;
		for(int i=1;i<n;i++) {
			while(anzL<=n-i) {
				l+=" ";
				anzL++;
			}
			if(i==1) {
				System.out.println(l+"*");
			}else {
				s="*"+s+"*";
				System.out.println(l+s);
			}
		}
     scanner.close();
	}

}
