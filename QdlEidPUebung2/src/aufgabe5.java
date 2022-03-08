import java.util.Scanner;
public class aufgabe5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String z="";
/*		if(n>0) {
			while(n>0) {
				z=n%10+" "+z;
				n=n/10;   
			}
			System.out.print(z);
		} else {
		 if(n<0) {
			n=n*(-1);
			while(n>0) {
				z=n%10+" "+z;
				n=n/10; 
			}
			System.out.print(z);
		 } else {
			 z=0+"";
				System.out.print(z);
		 }
		 
		} */     //(a)
		if(n>0) {
			while(n>0) {
				z=n%2+" "+z;
				n=n/2;
			}
			System.out.print(z);
		} else {
			if(n<0) {
				n=n*(-1);
				while(n>0) {
					z=n%2+" "+z;
					n=n/2;
				}
				System.out.print("-"+z);
			}
		}
		
	}

}
