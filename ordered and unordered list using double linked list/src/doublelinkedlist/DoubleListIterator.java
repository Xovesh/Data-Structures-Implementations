package doublelinkedlist;

import java.util.Iterator;

public class DoubleListIterator<T> implements Iterator<T> {
	
	private DoubleNode<T> current;
	
	
	public DoubleListIterator(DoubleNode<T> current) {
		this.current = current;
	}

	@Override
	public boolean hasNext() {
		return this.current != null;
	}

	@Override
	public T next() {
		if(hasNext()) {
			T result = this.current.getElement();
			this.current = this.current.getNext();
			return result;
		}
		return null;
	}

}
