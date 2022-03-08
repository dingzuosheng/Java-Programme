
public class Vergleichen {

	public static void main(String[] args) {
		int [] feld =new int[]{19,25,51,36,51,7};
		int max=feld[0];
		for(int i=0;i<feld.length;i++) {
			if(feld[i]>max) {
				max=feld[i];
			}
		}
       System.out.println(max);
	}

}
