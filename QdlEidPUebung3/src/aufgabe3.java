import java.util.Scanner;
public class aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		print();
		do {
		    n=scanner.nextInt();
		    switch(n) {
		    case 1:  System.out.println("(1)  Berechne die Summe der eingegebenen zahlen.");
		             int n1=scanner.nextInt();
		             System.out.println(f1(n1));
		             break;
		    case 2:  System.out.println("(2)  Berechne die Summe der eingegebenen geraden oder ungeraden zahlen.");
		             int n2=scanner.nextInt();
		             int c=scanner.nextInt();
		             if(c==0) {
		            	 System.out.println("die Summe der geraden zahlen ist :"+f2(n2));
		             }else {
		            	 System.out.println("die Summe der ungeraden zahlen ist :"+(f1(n2)-f2(n2)));
		             }
		             break;
		    case 3:  System.out.println("(3)  Berechne das Produkt der eingegebenen zahlen.");
		             int n3=scanner.nextInt();
		             System.out.println(f3(n3));
		             break;
		    case 4:  System.out.println("(4)  Berechne das Produkt durch x teilbaren eingegebenen zahlen.");
		             int n4=scanner.nextInt();
		             System.out.println(f4(n4));
		             break;
		    case 5:  System.out.println("(5)  Berechne das Maximum der eingegebenen zahlen.");
		             int n5=scanner.nextInt();
		             System.out.println(f5(n5));
		             break;
		    case 6:  System.out.println("(6)  Berechne das Minimum der eingegebenen zahlen.");
		             int n6=scanner.nextInt();
		             System.out.println(f6(n6));
		             break;
		    }
		}while(n<7);
		scanner.close();
	}
	public static void print() {
		System.out.println("(1)  Berechne die Summe der eingegebenen zahlen.");
		System.out.println("(2)  Berechne die Summe der eingegebenen geraden oder ungeraden zahlen.");
		System.out.println("(3)  Berechne das Produkt der eingegebenen zahlen.");
		System.out.println("(4)  Berechne das Produkt durch x teilbaren eingegebenen zahlen.");
		System.out.println("(5)  Berechne das Maximum der eingegebenen zahlen.");
		System.out.println("(6)  Berechne das Minimum der eingegebenen zahlen.");
		System.out.println("(7)  Beende das Programm.");
	}
	public static boolean isGerade(int n) {
		boolean erg=false;
		if(n%2==0) {
			erg=true;
		}else {
			erg=false;
		}
		return erg;
	}
	public static int f1(int n) {
		Scanner scanner =new Scanner(System.in);
		int summe=0;
		do {
			int m=scanner.nextInt();
			summe+=m;
			n--;
		}while(n>0);
		return summe;
	}
	public static int f2(int n) {
		Scanner scanner =new Scanner(System.in);
		int gsumme=0;
		do {
			int m=scanner.nextInt();
			if(isGerade(m)==true) {
				gsumme+=m;
			}
			n--;
		}while(n>0);
		return gsumme;
	}
	public static int f3(int n) {
		Scanner scanner =new Scanner(System.in);
		int produkte=1;
		do {
			int m=scanner.nextInt();
			produkte*=m;
			n--;
		}while(n>0);
		return produkte;
	}
	public static int f4(int n) {
		Scanner scanner=new Scanner(System.in);
		int produkte=1;
		int x=scanner.nextInt();
		do {
			int m=scanner.nextInt();
			if(m%x==0) {
				produkte*=m;
			}
			n--;
		}while(n>0);
		return produkte;
	}
	public static int f5(int n) {
		Scanner scanner =new Scanner(System.in);
		int maxi=Integer.MIN_VALUE;
		do {
			int m=scanner.nextInt();
			if(maxi<m) {
				maxi=m;
			}
			n--;
		}while(n>0);
		return maxi;
	}
	public static int f6(int n) {
		Scanner scanner=new Scanner(System.in);
		int mini=Integer.MAX_VALUE;
		do {
			int m=scanner.nextInt();
			if(mini>m) {
				mini=m;
			}
			n--;
		}while(n>0);
		return mini;
	}

}
