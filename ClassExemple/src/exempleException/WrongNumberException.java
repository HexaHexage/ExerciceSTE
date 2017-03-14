package exempleException;

public class WrongNumberException extends Exception {

	public WrongNumberException() {
		super();
	}

	public WrongNumberException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WrongNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongNumberException(String message) {
		super(message);
	}

	public WrongNumberException(Throwable cause) {
		super(cause);
	}

}