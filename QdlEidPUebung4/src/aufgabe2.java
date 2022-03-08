
import java.util.Scanner;
public class aufgabe2 {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[]array=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		
		print(even(array));

		int d=scanner.nextInt();
		int [] a = fillDivisible(d);
	    print( a );
	    System.out.println("");
	    printReverse( a );
	    System.out.println("");
	    print(reverseArray(a));
        scanner.close();
	}
	public static void print(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static int[] even(int[] array) {
		int s=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				s++;
			}
		}
		int[] feld=new int[s];
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				feld[s-1]=array[i];
				if(s>=1)
				s--;
			}
		}
		return feld;
	}
	public static int[] fillDivisible(int d) {
	     Scanner scanner=new Scanner(System.in);
	     int n =scanner.nextInt();
	     int i = 0;
	     int[] array=new int[n];
	     do {
	    	  int m=scanner.nextInt();
	    	  if(m%d==0) {
	    		  array[i++]=m;  //es sollte in der Array von vorne nach hintern ausgegeben werden,sonsten ist es falsch;
	    		  n--;
	    	  }
	     }while(n>=1);
	     return array;
	}
	public static void printReverse(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[array.length-i-1]+" ");
		}	
	}
	public static int[] reverseArray(int[] array) {
		int[] feld=new int[array.length];
		for(int i=0;i<array.length;i++) {
			feld[i]=array[array.length-1-i];
		}
		return feld;
	}
	
}
