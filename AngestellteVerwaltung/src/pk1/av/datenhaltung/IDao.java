package pk1.av.datenhaltung;

import java.util.List;

import pk1.av.fachlogik.Angestellte;

public interface IDao {
	void speichern(List<Angestellte> liste) throws PersistenzException;
	List<Angestellte> laden() throws PersistenzException;
}
