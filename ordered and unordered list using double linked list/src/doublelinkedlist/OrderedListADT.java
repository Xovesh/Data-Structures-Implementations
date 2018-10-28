package doublelinkedlist;

public interface OrderedListADT<T> extends ListADT<T>{
	/**  
	* Adds an element to the list in the proper location 
	*
	*/
	public void add(T element);
}
