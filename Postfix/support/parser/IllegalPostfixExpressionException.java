package parser;

public class IllegalPostfixExpressionException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalPostfixExpressionException() {
		super();
	}

	public IllegalPostfixExpressionException(String message) {
		super(message);
	}
}
