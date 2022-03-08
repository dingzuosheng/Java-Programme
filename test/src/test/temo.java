package test;

public class temo {

	public static void main(String[] args) {
		 int[][] feld =new int[3][4];
		 for(int i=0;i<feld.length;i++) {
			 for(int j=0;j<feld[0].length;j++) {
				 feld[i][j]=i+j;
		       System.out.print(feld[i][j]);
			 }
			 System.out.println();
		 }
	}

}
