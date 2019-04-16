package language;

public abstract class BinaryOperator<T> implements Operator<T> {

	protected Operand<T> op0;
	protected Operand<T> op1;

	@Override
	public final int getNumberOfArguments() {
		return 2;
	}

	@Override
	public void setOperand(int i, Operand<T> operand) {
		if (operand == null)
			throw new NullPointerException("Could not set null operand.");
		if (i > 1)
			throw new IllegalArgumentException("Binary operator only accepts operands 0 and 1 but recieved " + i + ".");
		if (i == 0) {
			if (op0 != null)
				throw new IllegalStateException("Position " + i + " has been previously set.");
			op0 = operand;
		} else {
			if (op1 != null)
				throw new IllegalStateException("Position " + i + " has been previously set.");
			op1 = operand;
		}
	}
}
