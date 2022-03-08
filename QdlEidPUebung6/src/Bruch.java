public class Bruch {
	int zaehler;
	int nenner;

	public Bruch(int a, int b) {
		this.zaehler = a;
		this.nenner = b;
	}

	public String toString() {
		return zaehler + "/" + nenner;
	}

	public double zuDouble() {
		return (double) (this.zaehler / this.nenner);
	}

	public void kuerz() {
		int min = 0;
		if (zaehler < nenner)
			min = zaehler;
		else
			min = nenner;
		while (min >= 2) {
			if (zaehler % min == 0 && nenner % min == 0) {
				zaehler = zaehler / min;
				nenner = nenner / min;
			}
			min--;
		}
		// System.out.println(new Bruch(zaehler,nenner));
	}

	public Bruch umkehr() {
		return new Bruch(nenner, zaehler);

	}

	public Bruch addiere(Bruch bruch) {

		int z = bruch.zaehler * this.nenner + bruch.nenner * this.zaehler;
		int n = bruch.nenner * this.nenner;
		Bruch b = new Bruch(z, n);
		b.kuerz();
		return b;
	}

	public Bruch multipliziere(Bruch bruch) {
		int n = bruch.nenner * this.nenner;
		int z = bruch.zaehler * this.zaehler;
		Bruch b = new Bruch(z, n);
		b.kuerz();
		return b;
	}

	boolean equal(Bruch bruch) {
		if (this.zaehler == bruch.zaehler && this.nenner == bruch.nenner) {
			return true;
		} else {
			return false;
		}
	}

}
