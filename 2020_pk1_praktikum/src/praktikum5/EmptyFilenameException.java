package praktikum5;

@SuppressWarnings("serial")
public class EmptyFilenameException extends Exception {
	public EmptyFilenameException() {
		super();
	}
	public EmptyFilenameException(String message) {
		super(message);
	}
	
}
