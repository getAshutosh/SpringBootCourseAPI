package effectivejavabookExample;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ClonableExample {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push("AKA");
		stack.push("AKs");
		stack.push("AKd");
		stack.pop();
		Stack stackClone = stack.clone();
		System.out.println("clone :"+stackClone.toString());
		
	}
}

class Stack {
	private Object[] elements;
	private int size = 0;
	private static /*final*/ int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	@Override
	public Stack clone() {
		try {
			Stack result = (Stack) super.clone();
			result.elements = elements.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	// Ensure space for at least one more element.
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}
