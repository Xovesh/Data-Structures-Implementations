package doublelinkedlist;

public class DoubleNode<T> {
	private  DoubleNode<T> next;
	private  DoubleNode<T> previous;
	private  T element;
	
	
	public DoubleNode(T element) {
		this.element = element;
		this.next = null;
		this.previous = null;
	}
	
	public DoubleNode<T> getNext() {
		return next;
	}
	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
	public DoubleNode<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleNode<T> previous) {
		this.previous = previous;
	}
	public T getElement() {
		return this.element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	
	
}
