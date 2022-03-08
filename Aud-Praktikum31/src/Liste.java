import java.util.*;

public class Liste<T>
{
	protected Link<T> anfang;
	protected Link<T> ende;

	public Liste()
	{
		// Leere Liste: alle Zeiger sind null (Standardwerte)
	}

	// Einfachster Fall und gleichzeitig Sonderfall:
	// Element am Anfang einf黦en
	
	public void einfuegen(final T daten)
	{
		// Funktioniert immer
		anfang = new Link<T>(daten, anfang);

		// Bei einer leeren Liste muss auch ende gesetzt werden
		if (ende == null)
			ende = anfang;
	}

	// Einfachster Fall und gleichzeitig Sonderfall:
	// Element am Anfang entfernen
	public T entfernen()
	{
		T opfer = null;

		// Clowns k鰊nten diese Methode bei leerer Liste aufrufen
		if (!istLeer())
		{
			// Bei einer Liste mit nur noch einem Element muss
			// auch ende gel鰏cht werden
			if (anfang == ende)
				ende = null;

			opfer = anfang.daten;
			anfang = anfang.naechster;
		}

		return opfer;
	}

	// Einfacher Fall: Anf黦en am Ende der Liste
	public void anfuegen(final T daten)
	{
		// Neuen Link anlegen
		Link<T> neu = new Link<T>(daten, null);

		// Wenn die Liste leer ist, m黶sen anfang und ende gesetzt werden
		if (istLeer())
		{
			// Neuen Link als anfang der Liste
			anfang = ende = neu;
		}
		else
		{
			// Anf黦en des Elements an das bisherige ende
			ende = ende.naechster = neu;
		}
	}

	// EINF蹽EN AN EINER BESTIMMTEN STELLE
	// Der Programmcode ist so gestaltet, dass er fehlerhafte Eingaben
	// (z.B. eine negative oder zu hohe Position) elegant verarbeitet
	// ohne abzust黵zen.
	public void einfuegen(final T daten, int position)
	{
		// Wenn die Liste leer oder die Position 0 ist, entspricht dies
		// einem Einf黦en am Anfang
		if (istLeer() || (position <= 0))
		{
			einfuegen(daten);

			return;
		}

		// VORG腘GER ZUR POSITION FINDEN
		// Dessen Vorg鋘ger muss es geben: lediglich bei einer leeren
		// Liste oder f黵 position==0 gibt es keinen. Genau diese F鋖le
		// wurden aber oben bereits behandelt! Wird eine zu hohe position
		// 黚ergeben, wird automatisch das letzte Element zum Vorg鋘ger.
		Link<T> vorgaenger = anfang;

		while ((--position > 0) && (vorgaenger.naechster != null))
			vorgaenger = vorgaenger.naechster;

		// Neues Element erzeugen
		vorgaenger.naechster = new Link<T>(daten, vorgaenger.naechster);

		// Beim Einf黦en als letztes Element muss auch ende gesetzt werden
		if (vorgaenger == ende)
			ende = vorgaenger.naechster;
	}

	public T entfernen(int position)
	{
		// Wenn die Liste leer oder die position < 0 ist, wird kein Element
		// entfernt
		if (istLeer() || (position < 0))
			return null;

		// Wenn die position 0 ist, wird am Anfang der Liste gel鰏cht
		if (position == 0)
			return entfernen();

		// VORG腘GER ZUR POSITION FINDEN
		// Bei einer leeren Liste oder f黵 position==0 gibt es keinen Vorg鋘ger;
		// genau diese F鋖le wurden oben bereits behandelt. Es gibt aber auch
		// keinen Vorg鋘er, wenn position zu gro� ist! In diesem Fall wird das
		// letzte Element NICHT Vorg鋘ger, damit nur tats鋍hlich existierende
		// Elemente aus der Liste entfernt werden.
		Link<T> vorgaenger = anfang;

		while ((--position > 0) && (vorgaenger != null))
			vorgaenger = vorgaenger.naechster;

		// Gibt es ein Element zum l鰏chen?
		if ((vorgaenger == null) || (vorgaenger.naechster == null))
			return null;

		final T opfer = vorgaenger.naechster.daten;

		// Element l鰏chen und ggf. ende anpassen beim L鰏chen des letzten
		// Listen-Elements
		if ((vorgaenger.naechster = vorgaenger.naechster.naechster) == null)
			ende = vorgaenger;

		return opfer;
	}

	// Liefert die Position eines bestimmten Elements oder -1 zur點k.
	// Existiert ein Element mehrfach, wird die Position des ersten Vorkommens
	// zur點kgegeben.
	public int suchen(final T daten)
	{
		// Liste leer?
		if (istLeer())
			return -1;

		Link<T> zeiger = anfang;
		int position = 0;

		// Abfrage auf Gleichheit ist m鰃lich mit equals (Operation von der Klasse Object)
		while ((zeiger != null) && !zeiger.daten.equals(daten))
		{
			position++;
			zeiger = zeiger.naechster;
		}

		return (zeiger == null) ? -1 : position;
	}

	public ListeIterator<T> iterator()
	{
		return new ListeIterator<T>(anfang, ende);
	}

	// Pr黤en, ob Liste leer ist
	public boolean istLeer()
	{
		// Diese Methode wird im Praktikum implementiert
		boolean erg=false;
		if(anfang==null) {
			anfang=ende=null;
			erg=true;
		}
		return erg;
	}

	public void verketten(Liste<T> zweiteListe)
	{
		assert(zweiteListe != null);
		// Diese Methode wird im Praktikum implementiert
		if(anfang!=null) {
			ende.naechster=zweiteListe.anfang;
			ende=zweiteListe.ende;     //beides ist nicht leer
		}else {
			anfang=zweiteListe.anfang;
			ende=zweiteListe.ende;      //zweite Liste ist nicht leer ,erste Liste ist leer
		}
		zweiteListe.anfang=zweiteListe.ende=null;//  beides ist leer
	}

	public int entferneWerte(final T opfer)
	{
		int anzGeloeschte = 0;

		// Diese Methode wird im Praktikum implementiert
		Link<T> zeiger=anfang;
		Link<T> vorgaenger=null;
		while(zeiger!=null) {
			if(zeiger.daten.equals(opfer)) {
				if(zeiger==anfang) {
				   anfang=zeiger.naechster;            //AM Anfang loeschen
				} else {
					if(zeiger==ende){
					  ende=vorgaenger;               //am Ende loeschen
					  vorgaenger.naechster=null;
					}else {
				        vorgaenger.naechster=zeiger.naechster;//in der Mitte Loeschen
					}
				}
				anzGeloeschte++;
			}else {
				vorgaenger=zeiger;	 //?	
			}
			zeiger=zeiger.naechster;
		}
		
		return anzGeloeschte;
	}
}