
public class DoubleZahl implements Ausdruck {
     double d;
     public DoubleZahl(double d) {
    	this.d=d; 
     }
	@Override
	public Ausdruck addiere(Ausdruck ausdruck) {
		DoubleZahl dz=new DoubleZahl(d+ausdruck.zuDouble());
		return dz;
	}
	@Override
	public Ausdruck multipliziere(Ausdruck ausdruck) {
		DoubleZahl dz=new DoubleZahl(d*ausdruck.zuDouble());
	    return dz;
	}
	@Override
	public double zuDouble() {
		return d;
	}
	@Override
	public boolean equals(Ausdruck ausdruck) {
		if(d==ausdruck.zuDouble())
			return true;
		else
		    return false;
	}
     
}
