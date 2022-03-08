package Edip_VL07;
public class ziffernfuellen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] feld=new int [8][8];
		num(feld);
	}
	public static void  num(int[][] feld) {
		int start = 2;
		for(int z = 0;z<feld.length;z++) {
			for(int s = 0;s<feld.length;s++) {
			  feld[z][s]=start+z+s; 
			  System.out.print(" "+feld[z][s]);
			}		
			System.out.println();
		}
			start++;		
	}
}
