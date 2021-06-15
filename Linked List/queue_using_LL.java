package linkedlist;

public class queue_using_LL {

	private Linkedlist queue;
	
	public queue_using_LL() {
		this.queue=new Linkedlist();
	}
	public int size() {
		return this.queue.size;
	}
	public boolean isEmpty() {
		return this.queue.size==0;
	}
	public void enqueue(int item) {
		this.queue.addLast(item);
	}
	public int dequeue() throws Exception {
		return this.queue.removeFirst();
	}
	public void display() {
		this.queue.display();
	}
}
