
public class PotenzOp extends BinaryOp {
       public PotenzOp(int n1,int n2) {
    	   super(n1,n2);
       }

	@Override
	public double calculate() {
		double erg=1;
	    for(int i=0;i<n2;i++) {
	    	erg*=n1;
	    }
		return erg;
	}

	@Override
	public String toString() {
		return "("+n1+"^"+n2+")";
	}
	
}
