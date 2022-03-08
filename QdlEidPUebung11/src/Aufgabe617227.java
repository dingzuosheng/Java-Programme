
public class Aufgabe617227 {

	public static void main(String[] args) {
		createPascal(5);
		
	}
	public static void createPascal(int size) {
		assert(size>=1);
		int[][] feld=new int[size][];
		for(int i=0;i<feld.length;i++) {
			feld[i]=new int[i+1];
			feld[i][0]=feld[i][i]=1;
			for(int j=1;j<i;j++) {
					feld[i][j]=feld[i-1][j]+feld[i-1][j-1];
			}
		}
		for(int i=0;i<feld.length;i++) {
			for(int j=0;j<feld[i].length;j++) {
				System.out.print(feld[i][j]);
			}
			System.out.println();
		}
	}

}
