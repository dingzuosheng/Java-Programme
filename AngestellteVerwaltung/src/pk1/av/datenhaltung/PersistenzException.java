package pk1.av.datenhaltung;

@SuppressWarnings("serial")
public class PersistenzException extends Exception {
	public PersistenzException() {
		super();
	}
	public PersistenzException(String message) {
		super(message);
	}
}
