package arraystack;

public class ArrayStack<T> implements StackADT<T> {
	
	private T[] elements;
	private int size;
	
	// default capacity
	public ArrayStack() {
		this.elements = (T[]) new Object[100];
		this.size = 0;
	}
	
	// capacity as parameter
	public ArrayStack(int length) {
		this.elements = (T[]) new Object[length];
		this.size = 0;
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			return null;
		}else {
			T element = this.elements[--this.size];
			this.elements[this.size] = null;
			return element;
		}
			
	}

	@Override
	public void push(T element) {
		if(size() == elements.length) {
			expandcapacity();
		}
		this.elements[this.size++] = element;
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return elements[size()-1];
	}

	@Override
	public boolean isEmpty() {
		
		return this.size == 0;
	}

	@Override
	public int size() {
		
		return this.size;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i=size()-1; i>=0; i--) {
			result = result + this.elements[i].toString() + "\n";
		}
		return result;
	}
	
	private void expandcapacity() {
		T[] update = (T[]) new Object[this.elements.length*2];
		
		for(int i=0; i<this.elements.length; i++) {
			update[i] = this.elements[i];
		}
		
		this.elements = update;
	}
	
	
}
