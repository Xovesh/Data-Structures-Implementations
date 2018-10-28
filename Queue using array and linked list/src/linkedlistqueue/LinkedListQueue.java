package linkedlistqueue;

public class LinkedListQueue<T> implements QueueADT<T> {
	
	private Node<T> front, rear;
	private int size;
	
	
	public LinkedListQueue() {
		this.front = null;
		this.size = 0;
		this.rear = null;
	}
	

	@Override
	public void enqueue(T element) {
		Node<T> elementtoadd = new Node<T>(element);
		if(isEmpty()) {
			this.front = elementtoadd;
		}else {
			rear.setNext(elementtoadd);
		}
		this.rear = elementtoadd;
		this.size++;
	}

	@Override
	public T dequeue() {
		T element = null;
		if(isEmpty()) {
			return element;
		}
		element = this.front.getElement();
		this.front = this.front.getNext();
		this.size--;
		return element;
	}

	@Override
	public T front() {
		if(isEmpty()) {
			return null;
		}
		return this.front.getElement();
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	
	
	public String toString() {
		String s = "";
		Node<T> current = this.front;
		while(current != null) {
			s = s + current.getElement().toString() + "\n";
			current = current.getNext();
		}
		return s;
	}

}
