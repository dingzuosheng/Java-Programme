import java.util.Scanner;
public class aufgabe2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float x=scanner.nextFloat();
		float y=scanner.nextFloat();
		float z=scanner.nextFloat();
		System.out.println(f1(x,y,z));
		System.out.println(f2(x,y,z));
		System.out.println(f3(x,y,z));
		System.out.println(f4(x,y,z));
		System.out.println(f5(x,y,z));
		System.out.println(f6(x,y));
		scanner.close();
	}
    public static float f1(float x,float y,float z) {
    	float erg=0.0f;
    	erg=x*x/(y+z);
    	return erg;
    }
    public static float f2(float x,float y,float z) {
    	float erg=0.0f;
    	erg=2*x-5*(y%z);
    	return erg;
    }
    public static float f3(float x,float y,float z) {
    	float erg=0.0f;
    	erg=(float) Math.pow((x-y*y)/(x*(y+z)), 5);
    	return erg;
    }
	public static float f4(float a,float b,float c) {
		float erg=0.0f;
		erg=(2*a-5*(b%c))/(a*a/(b+c));
		return erg;
	}
	public static float f5(float a,float b,float x) {
		float erg=0.0f;
		erg=(x*x/(a+b))*(x*x/(a+b))/(a+(a*a/(a+b)));
		return erg;
	}
	public static float f6(float x,float y) {
		float erg=0.0f;
		erg=(int)x/((int)y+1);
		return erg;
	}
}
