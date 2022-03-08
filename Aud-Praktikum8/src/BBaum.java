class BBaum<T extends Comparable<T>>
{
	public BKnoten<T> wurzel;

	public BBaum(BKnoten<T> wurzel)
	{
		assert(wurzel != null);

		this.wurzel = wurzel;
	}

	// Wrapper-Methode
	public void traversieren()
	{
		traversieren(wurzel);
	}

	// Eigentliche Implementierung
	private void traversieren(BKnoten<T> knoten)
	{
		//knoten.kinder[0]
	   // knoten ist der aktuelle Knoten;
		if(knoten.kinder!=null) {
			for(int j=0;j<knoten.kinder.length;j++) {
				traversieren(knoten.kinder[j]);
			}
		}else {
			for(int i=0;i<knoten.elemente.length;i++) {
				System.out.print(knoten.elemente[i].toString());
			}
		}
		
	}

	// Wrapper-Methode
	public boolean suchen(final T daten)
	{
		assert(daten != null);

		return suchen(daten, wurzel);
	}

	// Eigentliche Implementierung
	private boolean suchen(final T daten, BKnoten<T> knoten)
	{
		if(knoten.kinder!=null) {
			for(int i=0;i<knoten.kinder.length;i++) {
				suchen(daten,knoten.kinder[i]);
			}
		}else {
			for(int j=0;j<knoten.elemente.length;j++) {
				if(knoten.elemente[j]==daten) {
					return true;
				}
			}
		}
		return false;
	}
}