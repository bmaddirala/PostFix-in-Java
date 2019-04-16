package stack;

public class LinkedStack<T> implements StackInterface<T> {

	private LLNode<T> head = null;
	private int count = 0;

	@Override
	public T pop() throws StackUnderflowException {
		// TODO
		if (isEmpty()) {
			return null;
		}
		T answer = top();
		head = head.getNext();
		count--;
		return answer;
	}

	@Override
	public T top() throws StackUnderflowException {
		// TODO
		if (isEmpty()) {
			return null;
		}
		return head.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO
		return count == 0;
		// return head == null;
	}

	@Override
	public int size() {
		// TODO
		return count;
	}

	@Override
	public void push(T elem) {
		// TODO
		LLNode<T> answer = new LLNode<T>(elem);
		answer.setNext(head);
		head = answer;
		count++;
	}

}
