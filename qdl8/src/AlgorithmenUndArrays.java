import java.util.Scanner;
public class AlgorithmenUndArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		/*int [] fillzugeben;
		fillzugeben=fill(n);
		for(int i=0;i<fillzugeben.length;i++) {
		System.out.println(fillzugeben[i]);
		}
		int [] outzugeben=fill(n);
		out(outzugeben);
		outzugeben=out(n);
		for(int i=0;i<outzugeben.length;i++) {
			System.out.print(outzugeben[i]);
		}
		int [] evenzugeben = fill(n);
		out(evenzugeben);
		evenzugeben=even(n);
		for(int i=0;i<evenzugeben.length;i++) {
			System.out.print(evenzugeben[i]);
		}*/
		int [] fillzugeben;
		fillzugeben=fill(n);
		for(int i=0;i<fillzugeben.length;i++) {
			System.out.println(fillzugeben[i]);
		}
		out(fill(n));
		for(int i=0;i<fillzugeben.length;i++) {
			System.out.print(fillzugeben[i]);
		}
       
	}
	public static int [] fill(int n) {
		int [] feld =new int[n];
		Scanner scanner=new Scanner(System.in);	
		for(int i=0;i<feld.length;i++) {
			feld[i]=scanner.nextInt();
		}
		return feld;
	}
	public static void out(int [] feld,int n) {
		for(int i=0;i<feld.length;i++) {
			feld[i]=f
		}
			
	}
	public static int[] even(int feld[]) {
		 int count=0;
         
		for(int i=0;i<feld.length;i++) {
			
			if(feld[i]%2==0) {
				count++;
			}
		}
		int feld2[]=new int[count];
		return feld;
		
	}
	

}
