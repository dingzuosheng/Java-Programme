import java.util.Scanner;
public class Weihnachtenbaum1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

            int n=scanner.nextInt();
			String stern = "";
			int i=1;
			 do {
				 stern=stern +"*";
				 System.out.println(stern);
				 i++;
				
			 } while (i<=n);
			 scanner.close();	
	}
	      
}
		
			 
			 
			
		

	



