

public class Aufgabe2 {

	public static void main(String[] args) {
		int [] a= {1,3,5};
		int [] b= {2,4,6};
		int [] c=new int [a.length+b.length];
		merge(a,b,c);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
    }
	public static int[]  merge(int [] a,int [] b,int [] c) {
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=a.length;i<c.length;i++) {
			c[i]=b[i-a.length];
		}
		
		int minIndex=0;
		for(int i=1+minIndex;i<c.length;i++) {
			if(c[i]<c[minIndex]) {
				minIndex=i;
			}
		}
		
	 
	  
		   
	   return c;
	   
	}
	
	
	
}
