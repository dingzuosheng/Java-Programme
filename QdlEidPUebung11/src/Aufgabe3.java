
public class Aufgabe3 {

	public static void main(String[] args) {
		int[] array={1,2,3,3,5,9,7,7,1,3,7};
		System.out.println(berechneHaefigstenWert(array));
		int n=2031771;
	//	System.out.println(berechneHaefigsteZiffer(n));
		int[] feld=berechneHaefigsteZiffer(n);
		for(int i=0;i<feld.length;i++) {
			System.out.println(feld[i]);
		}
	}

	public static int berechneHaefigstenWert(int[] feld) {
		assert (feld != null);
		int[] array = new int[10];
		int max=0;
		int index=0;
		for (int j = 0; j < feld.length; j++) {
			int s = 0;
			for (int i = 0; i < feld.length; i++) {
				if (feld[i] == feld[j]) {
					s++;
				}
			}
			array[feld[j]]=s;
			if(array[feld[j]]>max) {
				max=array[feld[j]];
				index=feld[j];
			}
			
		}
		return index;	
	}
	public static int[] berechneHaefigsteZiffer(int n) {
		assert(n>0);
		int s=1;
		int m=n;
		while(m>9) {
			m/=10;
			s++;
		}
		int[] feld=new int[s];
		while(n>9) {
			int c=n%10;
			n/=10;
			int i=0;
			feld[s-1-i]=c;
			i++;
		}
		return feld;
	/*	for(int i=0;i<feld.length;i++) {
			System.out.print(feld[i]+" ");
	*/	}
	//	return berechneHaefigstenWert(feld);	
	}


