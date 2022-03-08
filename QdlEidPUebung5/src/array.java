
public class array {

	public static void main(String[] args) {
	//	int feld[] = { 1, 2, 3, 4 };
		// System.out.print(arrayToString(feld));
	//	int n = 1234;
		// printArray(intToArray(n));
		// printNumber(feld, 3);
		// System.out.println("");
		// printNumber(feld, 5);
		int[] array1 = { 9, 7, 3, 4 };
		int[] array2 = { 9, 5, 6 };
		int[] neuArray=sum(array1,array2);
	//	printNumber(neuArray,0);
		int n1=9734;
		int n2=956;
		printSum(n1,n2);
	}

	public static String arrayToString(int[] array) {
		String erg = "";
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1)
				erg = erg + array[i] + ",";
			else
				erg = erg + array[i];
		}
		return "[" + erg + "]"; // aufgabe 0
	}

	public static int[] intToArray(int n) {
		int s = 1;
		int a = n;
		while (a > 9) {
			a /= 10;
			s++;
		}
		int[] array = new int[s];
		for (int i = 0; i < array.length; i++) {
			array[array.length - 1 - i] = n % 10;
			n /= 10;

		}
		return array; // aufgabe 1 .1
	}

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1)
				System.out.print(array[i] + ",");
			else
				System.out.print(array[i]);
		}
		System.out.print("]"); // aufgabe 1.1
	}

	public static void printNumber(int[] array, int length) {
		String erg = "";
		int a=length-array.length;
		while (a > 0) {
			erg = " " + erg;
			a--;
		}
		for (int i = 0; i < array.length; i++) {
			erg = erg + array[i];
		}
		System.out.print(erg); // aufgabe 1.2
	}

	public static int[] sum(int[] array1, int[] array2) {
        int max=0;
        if(array1.length>array2.length) {
        	max=array1.length;
        }else {
        	max=array2.length;
        }
        int[] array=new int[max+1];
        int zw = 0;
        int uebertrag=0;
        for(int i=0;i<max+1;i++) {
        	int aktuell=max-i;
        	zw = uebertrag;
        	if( array1.length-1-i >= 0 )
        		zw += array1[array1.length-1-i];
        	if( array2.length-1-i >= 0 )
        		zw += array2[array2.length-1-i];
        	if(zw>9) {
        		array[aktuell]=zw-10;
        		uebertrag=1;
        	}else {
        		array[aktuell]=zw;
        		uebertrag=0;
        	}
        }
        return array;
	}
	public static void printSum(int n1,int n2) {
		int[] array1=intToArray(n1);
		int[] array2=intToArray(n2);
		int max;
		if(array1.length>array2.length)
			max=array1.length+1;
		else 
			max=array2.length+1;
		
		int[] temp = sum(array1,array2);
		printNumber(array1,temp.length+2);
		System.out.println();
		System.out.print("+");
		printNumber(array2,temp.length+1);
		System.out.println();
		for(int i=0;i<temp.length+2;i++)
		System.out.print("-");
		System.out.println();
		System.out.print("= ");
		printNumber(temp,0);
       

	}

}
