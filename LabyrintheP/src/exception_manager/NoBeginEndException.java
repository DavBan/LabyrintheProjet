package exception_manager;

public class NoBeginEndException extends Exception {

	public NoBeginEndException() {
	}

	public NoBeginEndException(String message) {
		super(message);
	}

	public NoBeginEndException(Throwable cause) {
		super(cause);
	}

	public NoBeginEndException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoBeginEndException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
