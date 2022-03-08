import java.lang.reflect.Array;

public class Stern {

	public static void main(String[] args) {
		

	}
	public Stern (int n) {
		if(n==5) {
			byte[][] array=new byte[5][5];
		} else {
			if(n%2==1) {
				byte [][] array=new byte[n][n];
			} else {
				byte [][] array=new byte[n+1][n+1];
			}
		}
	}
//	public byte[][] erzeugeSternMuster() {
		
//		return array;
		
//	}
	public void ausgeben() {
		
	}

}
