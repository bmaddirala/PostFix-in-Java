package stack;

public interface StackInterface<T> {

	public T pop() throws StackUnderflowException;

	public T top() throws StackUnderflowException;

	public void push(T elem);

	// Returns {@code true} if the stack contains no elements and false}
	// otherwise.

	public boolean isEmpty();

	/**
	 * Returns the number of elements in this stack.
	 * 
	 */
	public int size();

}
