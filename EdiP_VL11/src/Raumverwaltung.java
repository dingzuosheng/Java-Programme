
public class Raumverwaltung {
	private Raum[] derRaum = new Raum[100];
	int anzderRaum = 0;

	public void addRaum(Raum raum) {
		if (anzderRaum < derRaum.length) {
			this.derRaum[anzderRaum] = raum;
			anzderRaum++;
		}
	}

	public void ausgabeRaumliste() {
		for (int i = 0; i < anzderRaum; i++) {
			if (this.derRaum[i].getNutzer()!= null) {
				System.out.println(this.derRaum[i].getTrakt() + "." + this.derRaum[i].getEtage() + "."
						+ this.derRaum[i].getNummer() + ":" + this.derRaum[i].getNutzer().getName());
			}
		}
	}

	public Raumverwaltung() {

	}
}
