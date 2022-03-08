
public class Sortieren {

	public static void main(String[] args) {
		int [] feld =new int[] {420,188,97,35,301};
		for(int i=0;i<feld.length-1;i++) {
			int indexMin=0;
			for(int j=i+1;j<feld.length;j++) {
				if(feld[j]<feld[indexMin]) {
					indexMin=j;
				}
			}
			int zw=i;
			 feld[i]=feld[indexMin];
			 feld[indexMin]=zw;
		}

	}

}
