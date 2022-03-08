import java.util.Scanner;
public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int v=scanner.nextInt();
//		int value=3;
//		int matrix[][]=new int [7][7];
//		printMatrix(matrix);
//		int nums1[]= {1,2,3,4,3,2,1};
//		int nums2[]= {1,2,3,4,3,2,2};
//		int feld [][] =new int [n][n];
//		int v=2;
//		System.out.println("feld1: "+ istSymmetrisch(nums1));
//        System.out.println("feld2: "+ istSymmetrisch(nums2));
//        int matrix2[][]={{1,2,3,4,3,2,1},{2,3,4,5,4,3,2},{3,4,5,6,5,4,3},{4,5,6,7,6,5,4},{5,6,7,8,7,6,5},{6,7,8,9,8,7,6},{7,8,9,10,6,8,10}};
//        System.out.println("feldc: "+ istHorizontalSymmetrische(matrix2));
//        System.out.println("Die Anzahl von allen Vielfach ist :"+zaehleVielfache(matrix2,value));
		
        printMatrix(create(n,v));
	}
	public static void printMatrix (int [][] matrix) {
       
		for (int zeile = 0;zeile<matrix.length;zeile++) {
			for(int spalte=0;spalte<matrix[zeile].length;spalte++) {
				System.out.print(matrix[zeile][spalte]+"\t");
			}
			System.out.println();
		}
	}
	public static boolean istSymmetrisch(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if (nums[i]!=nums[nums.length-i-1]) 
		     return false;	
		}
		return true;
   }
	public static boolean istHorizontalSymmetrische(int [][] matrix2) {
		for(int z=0;z<matrix2.length;z++) {
			if (!istSymmetrisch(matrix2[z]))
			    return false;
		}
		return true;
	}
   public static int zaehleVielfache(int [][] matrix2,int value) {
		int zaehlen=0;
		for(int z=0;z<matrix2.length;z++) {
			for(int s=0;s<matrix2[z].length;s++) {
				if(matrix2[z][s]%value==0) 
					zaehlen++;			
			}
		}
		return zaehlen;
   }
   public static int [][] create (int n,int v) {
	   int feld [][] =new int [n][n];
	   int vSwitch = 0;
	   
	   for(int z=0;z<feld.length;z++) {
		   for(int s=0;s<feld[z].length;s++) {
			  if(z == s)
			  {
				  feld[z][s] = v;
				  vSwitch = -1;
			  } else 
			  if(vSwitch != 0)
			  {
				  if(vSwitch < 0) 
				  {
					  vSwitch = -vSwitch;
					  feld[z][s] = -v;  
				  }
				  else
				  {
					  vSwitch = -vSwitch;
					  feld[z][s] = v;
				  }
			  }
		   }
		   vSwitch = 0;
	   }
	   return feld;
   }
   

}
