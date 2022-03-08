
public class IndexMax {

	public static void main(String[] args) {
		int [] feld=new int[] {19,25,51,36,51,7};
		int indexMax=0;
		for(int i=0;i<feld.length;i++) {
			if(feld[i]>feld[indexMax]) {
				indexMax=i;
			}
		}
		System.out.println(indexMax);
	}

}
