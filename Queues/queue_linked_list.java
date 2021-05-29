package queues;
import java.util.*;
public class queue_linked_list {
	
	LinkedList <Integer> queue;
	public queue_linked_list(){
		queue=new LinkedList<>();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public void enqueue(int item) {
		queue.addLast(item);
	}
	
	public void dequeue() {
		queue.removeFirst();
	}
	public int get_front() {
		return queue.getFirst();
	}

	public static void main(String[] args) {
		queue_linked_list queue =new queue_linked_list();
		for(int i=0;i<6;i++) {
			queue.enqueue(i);
		}
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(10);
		while(!queue.isEmpty()) {
			System.out.println(queue.get_front());
			queue.dequeue();
		}
	}

}
