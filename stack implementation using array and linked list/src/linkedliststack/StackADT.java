package linkedliststack;

public interface StackADT<T> {
	
	// returns and remove the element in the top of the stack
	public T pop();
	
	// push an element in the top of the stack
	public void push(T element);
	
	// returns the element in the top
	public T peek();
	
	// returns a true if the stack is empty
	public boolean isEmpty();
	
	// returns the size of the stack
	public int size();
	
	// returns a string with the visulization of the stack
	public String toString();
}
