package linkedlist;

public class queue_LL_client {

	public static void main(String[] args) throws Exception{
		queue_using_LL queue=new queue_using_LL();
		queue.enqueue(10);
		queue.display();
		
		queue.enqueue(20);
		queue.display();
		
		queue.enqueue(30);
		queue.display();
		
		queue.dequeue();
		queue.display();
	}

}
