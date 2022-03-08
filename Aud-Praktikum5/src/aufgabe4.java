
public class aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   final double start1 = System.currentTimeMillis();
       System.out.println(fibRekursiv(50));
       final double end1=System.currentTimeMillis();
       System.out.println(end1-start1);
       final double start2 = System.currentTimeMillis();
       System.out.println(fibIterativ(50));
       final double end2 = System.currentTimeMillis();
       System.out.println(end2-start2);
	}
	public static long fibRekursiv(int n) {
		long f=0;
		if(n==0) 
			f=0;
		if(n==1)
			f=1;
		if(n>=2) 
			f=fibRekursiv(n-1)+fibRekursiv(n-2);
		
        return f;
		
	}
	public static long fibIterativ(int n) {
	     long aktuell=1;
	     long vorgaenger=0;
	     long erg=0;
	     for(int i=2;i<=n;i++) {
	    	erg=aktuell+vorgaenger;
	    	vorgaenger=aktuell;
	    	aktuell=erg;
	     }
	     return erg;
	}

}
