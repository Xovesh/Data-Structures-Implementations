package doublelinkedlist;

public class DoubleOrderedList<T>  extends DoubleList<T> implements OrderedListADT<T> {

	public DoubleOrderedList(){
		super();
	}
	
	@Override
	public void add(T element) {
		if (!(element instanceof Comparable)) {
			return;
		}
		
		DoubleNode<T> elementtoadd = new DoubleNode<T>(element);	
		
		if(isEmpty()) {
			this.front = elementtoadd;
			this.rear = elementtoadd;
		}else if(((Comparable<T>) element).compareTo(this.front.getElement())<=0) {
			this.front.setPrevious(elementtoadd);
			elementtoadd.setNext(this.front);
			this.front = elementtoadd;
		}else if(((Comparable) element).compareTo(this.rear.getElement())>=0) {
			this.rear.setNext(elementtoadd);
			elementtoadd.setPrevious(this.rear);
			this.rear = elementtoadd;
		}else {
			DoubleNode<T> current = this.front;
			while(((Comparable) element).compareTo(current.getElement())>0) {
				current = current.getNext();
			}
			
			elementtoadd.setPrevious(current.getPrevious());
			elementtoadd.setNext(current);
			current.getPrevious().setNext(elementtoadd);
			current.setPrevious(elementtoadd);
		}
		this.size++;
		
	}

	
	
}
