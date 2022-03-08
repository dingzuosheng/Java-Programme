package Edip_VL07;

public class geschachteltesFeld {

	public static void main(String[] args) {
		int[][] feld=new int[8][8];
		for(int i=0;i<feld.length;i++) {
			for(int j=0;j<feld.length;j++) {
				feld[i][j]=i+j+2;
				System.out.print(" "+feld[i][j]);
				
			}
			System.out.println();
		}
        
	}

}
