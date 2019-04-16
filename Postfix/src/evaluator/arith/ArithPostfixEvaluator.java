package evaluator.arith;

import evaluator.PostfixEvaluator;
import language.Operand;
import parser.IllegalPostfixExpressionException;
import parser.PostfixParser.Type;
import parser.Token;
import parser.arith.ArithPostfixParser;
import stack.LinkedStack;
import stack.StackInterface;

public class ArithPostfixEvaluator implements PostfixEvaluator<Integer> {

	private final StackInterface<Operand<Integer>> stack;

	public ArithPostfixEvaluator() {
		// TODO Initialize to your LinkedStack
		stack = new LinkedStack<Operand<Integer>>();
	}

	@Override
	public Integer evaluate(String expr) throws IllegalPostfixExpressionException {
		ArithPostfixParser parser = new ArithPostfixParser(expr);

		for (Token<Integer> token : parser) {
			Type type = token.getType();

			switch (type) {
			case OPERAND:

				stack.push(token.getOperand());
				break;
			case OPERATOR:

				if (token.getOperator().getNumberOfArguments() == 1) {
					token.getOperator().setOperand(0, stack.pop());
				} else {
					token.getOperator().setOperand(1, stack.pop());
					token.getOperator().setOperand(0, stack.pop());
				}
				stack.push(token.getOperator().performOperation());
				break;
			default:
				throw new IllegalStateException("Parser returned an invalid Type: " + type);
			}

		}

		return stack.pop().getValue();
	}

}
