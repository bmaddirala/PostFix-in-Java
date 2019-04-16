package language;

public class Operand<T> {

	private final T value;

	public Operand(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public String toString() {
		return value.toString();
	}
}
