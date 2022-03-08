
public class ArrayProgrammierung {

	public static void main(String[] args) {
	  int [][] feld= {{0,10,10,0},{235,210,99,43},{17,93,128,167}};
	  byte[][] bild = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	  System.out.println(drehe90GradLinks(bild));
	}
	public static boolean istHorizontalSymmetrisch(byte[][] bild) {
		boolean hs=false;
		for(int z=0;z<bild.length;z++) {
			for(int s=0;s<bild[0].length;s++) {
				if(bild[z][s]==bild[z][bild[0].length-s-1]) {
					hs=true;
				}else {
					
				}
			}
		}
		return hs;
	}
	public static byte [][] drehe90GradLinks(byte[][] bild){
		byte[][] bild2=new byte[4][3];
		int z=0;
		int s=3;
		for(int i=0;i<bild2.length;i++) {
			for(int j=0;j<bild2[0].length;j++) {
				if(z<4) {
				bild2[i][j]=bild[z][s];
				z++;
				}
			}
			s--;
		}
	    return bild2;
	}

}
