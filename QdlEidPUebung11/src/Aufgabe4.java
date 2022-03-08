
public class Aufgabe4 {

	public static void main(String[] args) {
		byte[][] array1 = { { 0, 10, 10, 0 }, { (byte) 235, 69, 69, (byte) 235 }, { 120, 75, 75, 120 } };
		byte[][] array2 = { { 0, 40, 0 }, { (byte) 235, 80, (byte) 235 }, { (byte) 128, 99, (byte) 128 } };
		byte[][] array3 = { { 0, 10, 10, 0 }, { (byte) 235, (byte) 210, 99, 43 }, { 17, 93, (byte) 128, (byte) 167 } };
		System.out.println(istHorizontalSymmetrisch(array1));
		System.out.println(istHorizontalSymmetrisch(array2));
		System.out.println(istHorizontalSymmetrisch(array3));
		byte[][] array4= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		array4 = drehe90GradLinks(array4);
		for(int i=0;i<array4.length;i++) {
			for(int j=0;j<array4[0].length;j++) {
				System.out.print(array4[i][j]);
			}
			System.out.println("");	
			}
		
	}

	public static boolean istHorizontalSymmetrisch(byte[][] bild) {
		for (int i = 0; i < bild.length; i++) {
			for (int j = 0; j < bild[0].length; j++) {
				if (bild[i][j] != bild[i][bild[0].length - 1 - j]) {
					return false;
				} 
			}
		}
		return true;
	}
	public static byte[][] drehe90GradLinks(byte[][] bild){
		byte[][] array=new byte[bild[0].length][bild.length];
		for(int i=0;i<bild.length;i++) {
			for(int j=0;j<bild[0].length;j++) {
				array[array.length-1-j][i]=bild[i][j];
			}
		}
		return array;
	}
	
}
