import java.util.Scanner;
public class aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	  print(read2DimArray());
      int[][] array= {{1,2,3},{4,5},{1,3,7}};
      int [][] array2= {{1,2,3},{4,5,6},{7,8,9}};
     int[] feld= convert2DimTo1Dim(array2);
     for(int i=0;i<feld.length;i++) {
    	 System.out.print(feld[i]+" ");
     }
     System.out.println(" ");
      print(filter(array,9));
	}
	public static void print(int[][] array){
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
		  System.out.println();
		}
	}
	public static int[][] read2DimArray(){
		Scanner scanner =new Scanner(System.in);
		int r=scanner.nextInt();
		int[][] array=new int[r][];
		int c;
		for(int i=0;i<r;i++) {
		       c=scanner.nextInt();
		       array[i]=new int[c];
		       
		       for(int j=0;j<c;j++) {
		    	   array[i][j]=scanner.nextInt();
		       }
		}
		return array;
	}
	public static int[] convert2DimTo1Dim(int[][] array) {
		int[] feld=new int[array.length*array[0].length];
		int n=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
					feld[n]=array[i][j];
					n++;
			}
		}
		return feld;
	}
	public static int[][] sum(int[][] array){
		int[][] feld=new int[array.length][1];
		for(int i=0;i<array.length;i++) {
			int sum=0;
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
			}
			feld[i][0]=sum;
		}
		return feld;
	}
	public static int[][] filter(int[][] array,int n){
		
		int s=0;
		for(int i=0;i<array.length;i++) {
			if(sum(array)[i][0]>=n) {
				s++;
			}
		}
		int [][] feld=new int[s][1];
		int m=0;
		for(int i=0;i<array.length;i++) {
			if(sum(array)[i][0]>=n) {
				feld[m][0]=sum(array)[i][0];
				m++;
			}
		}
		return feld;
		
	}

}
