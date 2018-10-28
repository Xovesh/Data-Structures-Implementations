package arrayqueue;

public class Test {

	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<Integer>(2);
		queue.enqueue(1);
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(3);
		System.out.println("Visualize queue");
		System.out.println(queue);
		System.out.println("Dequeue an item");
		System.out.println("Item: " + queue.dequeue());
		System.out.println("Visualize queue");
		System.out.println(queue);
		System.out.println("Size");
		System.out.println(queue.size());
		System.out.println("Visualize queue");
		System.out.println(queue);
		queue.enqueue(2);
		queue.enqueue(9);
		queue.enqueue(9);
		queue.enqueue(6);
		queue.enqueue(10);
		System.out.println("Visualize front");
		System.out.println(queue.front());
		System.out.println("Is Empty");
		System.out.println(queue.isEmpty());
	}

}
