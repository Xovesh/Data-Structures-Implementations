package arrayqueue;

public class ArrayQueue<T> implements QueueADT<T> {
	
	private T[] queue;
	private int size, front, rear;
	
	
	public ArrayQueue() {
		this.queue = (T[]) new Object[100];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}
	
	public ArrayQueue(int length) {
		this.queue = (T[]) new Object[length];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}

	@Override
	public void enqueue(T element) {
		if(size() == this.queue.length) {
			expand();
		}
		
		this.queue[rear] = element;
		rear = (rear+1) % this.queue.length;
		this.size ++;
	}

	@Override
	public T dequeue() {
		T result = null;
		if(isEmpty()) {
			return result;
		}else {
			result = this.queue[front];
			this.queue[front] = null;
			front = (front+1) % this.queue.length;
			this.size--;
		}
		return result;
	}

	@Override
	public T front() {
		return this.queue[this.front];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	private void expand() {
		T[] larger = (T[]) new Object[this.queue.length*2];
		
		for(int i = 0; i<this.size; i++) {
			larger[i] = this.queue[this.front];
			front = (front+1) % this.queue.length;
		}
		front = 0;
		rear = this.size;
		this.queue = larger;
		
	}
	
	public String toString() {
		String s = "";
		int i = this.front;
		int count = 0;
		while(count != this.size()) {
			s = s + this.queue[i].toString() + "\n";
			i = (i+1) % this.queue.length;
			count++;
		}
		return s;
	}

}
