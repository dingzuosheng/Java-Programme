import java.util.Scanner;
public class aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner =new Scanner(System.in);
       int r=3;
       int c=3;
       print(createMatrix(r,c));
       int[][] array=new int[r][c];
       System.out.println("");
       print(readMatrix(array));
       print(fillMatrix(array));
	}
	
	public static int[][] createMatrix(int r,int c){
		int[][] array=new int[r][c];
		return array;
	}
	public static int[][] readMatrix(int[][] matrix) {
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		return matrix;
	}
	public static int[][] fillMatrix(int[][]matrix){
		int n = matrix.length*matrix[0].length ;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=n--;
			}
		}
		return matrix;      //matrix ist schon vorgegeben;jede Element sollte um 1 erniederigen lassen;
	}
	public static void print(int[][] array){
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
		  System.out.println();
		}
	}
}
