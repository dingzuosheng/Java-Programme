
public class Bruch implements Ausdruck {
	Ausdruck zaehler;
	Ausdruck nenner;

	public Bruch(Ausdruck a, Ausdruck b) {
		this.zaehler = a;
		this.nenner = b;
	}

	@Override
	public Ausdruck addiere(Ausdruck ausdruck) {
		Bruch b = new Bruch(zaehler.addiere(ausdruck.multipliziere(nenner)), nenner);
		return b;
	}

	@Override
	public Ausdruck multipliziere(Ausdruck ausdruck) {
		Bruch b = new Bruch(zaehler.multipliziere(ausdruck), nenner);
		return b;
	}

	@Override
	public double zuDouble() {

		return zaehler.zuDouble() / nenner.zuDouble();
	}

	@Override
	public boolean equals(Ausdruck ausdruck) {
        if(zaehler.zuDouble() / nenner.zuDouble()==ausdruck.zuDouble())
        	return true;
        else
		    return false;
	}

}
