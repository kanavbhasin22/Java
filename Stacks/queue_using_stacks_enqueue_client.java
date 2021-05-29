package stacks;

public class queue_using_stacks_enqueue_client {

	public static void main(String[] args) throws Exception {
		queue_using_stack_enqueue q=new queue_using_stack_enqueue();
		for (int i=1;i<5;i++) {
			q.enqueue(i*10);
		}
		q.display();
		System.out.println(q.dequeue());
		q.display();
		System.out.println(q.front());
		
	}

}
