package Edip_VL10;

public class Girokonto {
	private String kontonummer;
	private double kontostand;
	private double dispokredit;
	private static int anzahlKonten;

	public Girokonto() {
		anzahlKonten++;
		int t = 822000000+ anzahlKonten;
		this.kontonummer ="0"+t;
		
	}

	public String getKontonummer() {
		return this.kontonummer;
	}

	public double getKontostand() {
		return this.kontostand;
	}

	public double getDispokredit() {
		return this.dispokredit;
	}

	public void setDispokredit(double kredit) {
		this.dispokredit = kredit;
	}

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	public boolean auszahlen(double betrag2) {
		boolean a = false;
		if(kontostand+dispokredit>betrag2)
	    {
			this.kontostand -= betrag2;
			a = true;
		} else {
			a = false;
		}
		return a;
	}

	public boolean ueberweisung(Girokonto zweitesKonto, double betrag) {
		boolean u = false;
		if (this.auszahlen(betrag) == true) {
			zweitesKonto.einzahlen(betrag);
			u = true;
		} else {
			u = false;
		}
		return u;
	}
	public boolean lastschrift(Girokonto zweitesKonto, double betrag) {
		boolean u = false;
		if (zweitesKonto.auszahlen(betrag) == true) {
			this.einzahlen(betrag);
			u = true;
		} else {
			u = false;
		}
		return u;
	}

	public String toString() {
		return this.kontonummer+"," + this.kontostand+"," + this.dispokredit;
	}
}
