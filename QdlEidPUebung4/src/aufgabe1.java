import java.util.Scanner;
public class aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		printArray(generateArray(n));
		int c=scanner.nextInt();
		printArray(fillArray(n,c));
		printArray(readArray(n));
		scanner.close();
	}
	public static int[] generateArray(int n) {
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
			
		}
		return array;
	}
	public static void printArray(int[] array) {
		int i=0;
		while(i<array.length-1) {
			System.out.print(array[i]+",");
			i++;
		}
		System.out.print(array[array.length-1]);
	}
	public static int[] fillArray(int n,int c) {
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=c;
		}	
		return array;
	}
	public static int[] readArray(int n) {
		Scanner scanner=new Scanner(System.in);
		int[] array=new int[n];
		do {
			array[n-1]=scanner.nextInt();
			n--;
		}while(n>=1);
		return array;
	}

}
