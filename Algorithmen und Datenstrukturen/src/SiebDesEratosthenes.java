import java.util.Scanner;
public class SiebDesEratosthenes {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
	   int [] feld =new int [n];
	   for(int i=0;i<n;i++) {
		   feld[i]=i+1;
		   System.out.print(feld[i]+" ");
	   }
	   System.out.println(" ");// Ausgabe von allen Zahlen ;
	   feld[0]=0;
	
	   int kleinste=2;
	   while(kleinste*kleinste<=n) {
		 if(feld[kleinste-1]!=0) {
			   for( int j=2*kleinste;j<=n;j=j+kleinste) {
				  
				     
					     feld[j-1]=0;	
				      
				    // Vielfach von kleinste Zahlen durchstreichen;
				 }
				   
		 } 
		  
	   kleinste++;
	   }   
		for(int i=0;i<n;i++) {
			if(feld[i]!=0) {
				System.out.print(feld[i]+" ");
			}
		}
	   
	   
	}
	
  
}
