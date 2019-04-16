package evaluator;

import parser.IllegalPostfixExpressionException;

public interface PostfixEvaluator<T> {

	public T evaluate(String expr) throws IllegalPostfixExpressionException;

}
