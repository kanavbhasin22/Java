package queues;

public class dy_queue_client {

	public static void main(String[] args) {
		dy_queue dynamic=new dy_queue();
		dynamic.enqueue(1);
		dynamic.enqueue(2);
		dynamic.enqueue(3);
		dynamic.enqueue(4);
		dynamic.enqueue(5);
		dynamic.enqueue(6);
		dynamic.enqueue(7);
		dynamic.enqueue(8);
		dynamic.enqueue(9);
		dynamic.enqueue(10);
		dynamic.enqueue(11);
		dynamic.enqueue(12);
		dynamic.display();
	}

}
