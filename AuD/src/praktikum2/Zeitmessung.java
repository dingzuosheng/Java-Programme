package praktikum2;
import java.util.Scanner;

public class Zeitmessung
{
	private static double tuwas()
	{
		return Math.random();// beliebig eine Zahl zwischen den Interval; 
	}

	// Linear
	public static double func1(int n)
	{
		double summe = 0;

		for (int a = 0; a < n; a++)
			summe += tuwas();

		return summe;
	}

	// Quadratisch
	public static double func2(int n)
	{
		double summe = 0;

		for (int a = 0; a < n; a++)
			for(int b = 0; b < n; b++)
				summe += tuwas();

		return summe;
	}

	// log2(n)
	public static double func6(int n)
	{
		double summe = 0;

		while (n > 0)
		{
			summe += tuwas();
			n /= 2;
		}

		return summe;
	}

	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		int n ;
		do {
		System.out.println("Bitte eine Zahl  eingeben :");
		 n = scanner.nextInt();
		 StopUhr s = new StopUhr();
			s.start();
			func1(n);
			s.stop();
			System.out.println(s.getDuration());
			s.start();
			func2(n);
			s.stop();
			System.out.println(s.getDuration());
			s.start();
			func6(n);
			s.stop();
			System.out.println(s.getDuration());
		}while(n>=1);
		
		scanner.close();
		}
}

