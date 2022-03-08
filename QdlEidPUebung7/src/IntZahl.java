
public class IntZahl implements Ausdruck {
	int i;

	public IntZahl(int i) {
		this.i = i;
	}

	@Override
	public Ausdruck addiere(Ausdruck ausdruck) {
		DoubleZahl iz = new DoubleZahl(i + ausdruck.zuDouble());
		return iz;
	}

	@Override
	public Ausdruck multipliziere(Ausdruck ausdruck) {
		DoubleZahl iz = new DoubleZahl(i * ausdruck.zuDouble());
		return iz;
	}

	@Override
	public double zuDouble() {
		return  i;
	}

	@Override
	public boolean equals(Ausdruck ausdruck) {
		if (i == (int)ausdruck.zuDouble())
			return true;
		else
			return false;
	}

}
