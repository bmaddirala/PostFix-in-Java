package parser;

import language.Operand;
import language.Operator;
import parser.PostfixParser.Type;

public class Token<T> {
	private final Type type;
	private final Operand<T> operand;
	private final Operator<T> operator;

	public Token(Type type, Operand<T> operand) {
		this.type = type;
		this.operand = operand;
		this.operator = null;
	}

	public Token(Type type, Operator<T> operator) {
		this.type = type;
		this.operand = null;
		this.operator = operator;
	}

	/**
	 * 
	 * @return the Type of this token
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Returns the operand this token represents.
	 * 
	 */
	public Operand<T> getOperand() {
		if (operand == null) {
			throw new IllegalStateException("token does not represent an operand");
		}
		return operand;
	}

	/**
	 * Returns the operator this token represents.
	 */
	public Operator<T> getOperator() {
		if (operator == null) {
			throw new IllegalStateException("token does not represent an operator");
		}
		return operator;
	}
}
