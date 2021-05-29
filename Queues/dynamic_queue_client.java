package queues;

public class dynamic_queue_client {
	public static void main(String[] args) throws Exception {
		dynamic_queue q= new dynamic_queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		System.out.println(q.front());
	}
	}
