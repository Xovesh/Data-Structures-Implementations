package linkedliststack;

public class LinkedListStack<T> implements StackADT<T> {
	
	private Node<T> front;
	private int size;
	
	public LinkedListStack() {
		this.front = null;
		this.size = 0;
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		Node<T> element = this.front;
		this.front = element.getNext();
		size--;
		return element.getElement();
	}

	@Override
	public void push(T element) {
		Node<T> newnode = new Node<T>(element);
		newnode.setNext(this.front);
		this.front = newnode;
		this.size++;
	}

	@Override
	public T peek() {
		return this.front.getElement();
	}

	@Override
	public boolean isEmpty() {
		return this.front == null;
	}

	@Override
	public int size() {
		
		return this.size;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node<T> current = this.front;
		while(current!= null) {
			s = s +current.getElement()+ "\n";
			current = current.getNext();
		}
		return s;
	}

}
