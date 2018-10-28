package linkedlistqueue;

public interface QueueADT<T> {
	
	// adds one element to the rear of the queue
	public void enqueue(T element);
	//returns and remove the element at the front of the queue
	public T dequeue();
	// returns the element at the front of the queue
	public T front();
	// returns the size of the queue
	public int size();
	// returns true if the queue contains no elements
	public boolean isEmpty();
	// returns a string representation of this queue
	public String toString();
}
