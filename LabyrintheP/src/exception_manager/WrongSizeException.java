package exception_manager;

public class WrongSizeException extends Exception {

	public WrongSizeException() {
	}

	public WrongSizeException(String message) {
		super(message);
	}

	public WrongSizeException(Throwable cause) {
		super(cause);
	}

	public WrongSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
