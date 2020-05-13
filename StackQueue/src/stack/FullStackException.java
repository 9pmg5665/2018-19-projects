package stack;

public class FullStackException extends RuntimeException {
	String message;

	public FullStackException(String message) {
		super();
		this.message = message;
	}
	
}
