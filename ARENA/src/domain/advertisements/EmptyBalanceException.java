package domain.advertisements;

public class EmptyBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyBalanceException(String message) {
		super(message);
	}

}
