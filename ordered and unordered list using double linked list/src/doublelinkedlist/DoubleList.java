package doublelinkedlist;

import java.util.Iterator;

public class DoubleList<T> implements ListADT<T> {
	
	protected DoubleNode<T> front;
	protected DoubleNode<T> rear;
	protected int size;
	
	
	
	public DoubleList() {
		this.size = 0;
		this.front = null;
		this.rear = null;
	}

	@Override
	public T removeFirst() {
		if(isEmpty()) {
			return null;
		}
		T result = this.front.getElement();
		this.front = this.front.getNext();
		
		if(this.front == null) {
			this.rear = null;
		}else {
			this.front.setPrevious(null);
		}
		this.size--;
		return result;
		
	}

	@Override
	public T removeLast() {
		if(isEmpty()) {
			return null;
		}
		T result = this.rear.getElement();
		this.rear = this.rear.getPrevious();
		
		if(this.rear == null) {
			this.front = null;
		}else {
			this.rear.setNext(null);
		}
		this.size--;
		return result;
		
	}

	@Override
	public T remove(T element) {
		DoubleNode<T> target = find(element);
		
		if(target == null) {
			return null;
		}
		
		T result = target.getElement();
		if(target == this.front) {
			this.front = this.front.getNext();
			this.front.setPrevious(null);
		}else if(target == this.rear) {
			this.rear = this.rear.getPrevious();
			this.rear.setNext(null);
		}else {
			target.getPrevious().setNext(target.getNext());
			target.getNext().setPrevious(target.getPrevious());
		}
		size--;
		return result;
	}

	@Override
	public T first() {
		if(isEmpty()) {
			return null;
		}else {
			return this.front.getElement();
		}
	}

	@Override
	public T last() {
		if(isEmpty()) {
			return null;
		}else {
			return this.rear.getElement();
		}
	}

	@Override
	public boolean contains(T target) {
		return find(target) != null;
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
	public Iterator<T> iterator() {
		return new DoubleListIterator<T>(this.front);
	}
	
	private DoubleNode<T> find(T target){
		if(isEmpty()) {
			return null;
		}
		boolean found = false;
		DoubleNode<T> result = null;
		DoubleNode<T> current = this.front;
		
		while(current != null && !found) {
			if(current.getElement().equals(target)) {
				found = true;
				result = current;
			}else {
				current = current.getNext();			
			}
		}
		
		return result;
	}

	@Override
	public String toString() {
		String result = "";
		DoubleNode<T> current = this.front;
		while (current != null) {
			result = result + current.getElement().toString() + "\n";
			current = current.getNext();
		}
		return result;
	}
	
	
}
