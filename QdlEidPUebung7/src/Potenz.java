
public class Potenz implements Ausdruck {
	Ausdruck basis;
	int exponent;

	public Potenz(int exponent, Ausdruck basis) {
		this.exponent = exponent;
		this.basis = basis;
	}

	@Override
	public Ausdruck addiere(Ausdruck ausdruck) {
		Ausdruck b = basis;
		for (int i = 0; i < exponent; i++) {
			b = b.multipliziere(basis);
		}
		Potenz p = new Potenz(1, b.addiere(ausdruck));
		return p;
	}

	@Override
	public Ausdruck multipliziere(Ausdruck ausdruck) {
		Ausdruck b = basis;
		for (int i = 0; i < exponent; i++) {
			b = b.multipliziere(basis);
		}
		Potenz p = new Potenz(1, b.addiere(ausdruck));
		return p;
	}

	@Override
	public double zuDouble() {
		double erg = 1;
		for (int i = 0; i < exponent; i++) {
			erg *= basis.zuDouble();
		}
		return erg;
	}

	@Override
	public boolean equals(Ausdruck ausdruck) {
		Potenz p = new Potenz(exponent, basis);
		if (p.zuDouble() == ausdruck.zuDouble())
			return true;
		else
			return false;
	}

}
