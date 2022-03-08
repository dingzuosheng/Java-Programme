import java.util.Scanner;
public class aufgabe1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");//1
		
		String str="Hello World !";
		System.out.println(str); //2
		
		str = "Matrikelnummer";
		System.out.println(str); //3
		
		
		str += ": <MatNr>";
		System.out.println(str); //4
		
		System.out.println("Matrikelnummer: <7202573>"); //5
		
		int n=42;//6
		
		System.out.println("n: <"+n+">"); //7
		
		n+=5;
		System.out.println("n: <"+n+">");//8
		
		float f = 1.2f;//9
        f*=2;
        f=(int) f;  //10
        
        float x = f+n;
        System.out.println(f);
        System.out.println(x);//11
        
        x=x*x;
        System.out.println(x);//12
        
        Scanner scanner = new Scanner(System.in);
         str = scanner.next(); 
         System.out.println(str);//13
         
         str = scanner.next();
         System.out.println(scanner.next());//14
         
          n =scanner.nextInt();
          System.out.println(n);//15
          
          n =scanner.nextInt();
          System.out.println((scanner.nextInt())*(scanner.nextInt()));//16
          
          scanner.close();
          
	}

}
