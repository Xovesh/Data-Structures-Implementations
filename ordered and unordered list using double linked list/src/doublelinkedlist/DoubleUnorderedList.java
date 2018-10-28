package doublelinkedlist;

public class DoubleUnorderedList<T> extends DoubleList<T> implements UnorderedListADT<T> {
	
	public DoubleUnorderedList() {
		super();
	}
	@Override
	public void add(T element) {
		DoubleNode<T> elementtoadd = new DoubleNode<T>(element);
		if(isEmpty()) {
			this.front = elementtoadd;
			this.rear = elementtoadd;
		}
		else {
			this.front.setPrevious(elementtoadd);
			elementtoadd.setNext(this.front);
			this.front = elementtoadd;
		}
		this.size++;
	}

}
