package language;

public interface Operator<T> {

	public int getNumberOfArguments();

	public Operand<T> performOperation();

	public void setOperand(int position, Operand<T> operand);

}
