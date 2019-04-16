package parser;

public interface PostfixParser<T> extends Iterable<Token<T>> {

	/**
	 * can produce different types.
	 *
	 */
	public static enum Type {

		/**
		 * Indicates that the value being parsed
		 */
		OPERAND,

		/**
		 * Indicates that the value being parsed
		 */
		OPERATOR;
	}
}
