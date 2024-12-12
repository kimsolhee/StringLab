package exceptions;

public class StringLabException extends RuntimeException {
	
	public StringLabException(String message) {
        super(message);
    }

    public StringLabException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
