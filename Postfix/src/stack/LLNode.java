package stack;

public class LLNode<T> {

	private T data;
	private LLNode<T> next;

	public LLNode(T data) {
		if (data == null)
			throw new NullPointerException();
		this.data = data;
	}

	// Returns the data stored

	public T getData() {
		return data;
	}

	/**
	 * Sets the data stored
	 * 
	 */
	public void setData(T data) {
		if (data == null)
			throw new NullPointerException();
		this.data = data;
	}

	/*
	 * Returns the node that this one references.
	 */
	public LLNode<T> getNext() {
		return next;
	}

	/**
	 * Sets the node that this one is referencing.
	 */
	public void setNext(LLNode<T> next) {
		this.next = next;
	}

}
