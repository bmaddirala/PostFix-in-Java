package language.arith;

import language.Operand;

public class NegateOperator extends UnaryOperator<Integer> {

	@Override
	public Operand<Integer> performOperation() {
		// TODO Auto-generated method stub
		if (op0 == null)
			throw new IllegalStateException("Could not perform operation prior to operands being set.");
		Integer result = -op0.getValue();
		return new Operand<Integer>(result);
	}

}
