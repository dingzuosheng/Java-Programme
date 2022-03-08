
public class Potenz {
	Bruch basis;
	int exponent;
	

	public Potenz(int exponent, Bruch basis) {
		this.exponent = exponent;
		this.basis = basis;
	}

	public String toString() {
		return "(" + basis +")"+"^" + exponent;
	}

	public double zuDouble() {
		double erg=1;
		for(int i=0;i<exponent;i++) {
			erg*=basis.zuDouble();
		}
		return erg;
	}

	public Bruch zuBruch() {
		Bruch b = new Bruch(1, 1);
		for (int i = 0; i < exponent; i++) {
			b = basis.multipliziere(b);
		}
		return b;
	}

	public Potenz multipliziere(Potenz potenz) {
			if (this.basis == potenz.basis) {
				return new Potenz(this.exponent + potenz.exponent, potenz.basis);
		
			} else if(this.exponent==potenz.exponent){
				return new Potenz(potenz.exponent,potenz.basis.multipliziere(this.basis));
			}else {
				return null;
			}
	}
}
