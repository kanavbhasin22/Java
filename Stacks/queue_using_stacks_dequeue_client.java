package stacks;

public class queue_using_stacks_dequeue_client {

	public static void main(String[] args) throws Exception {
		queue_using_stacks_dequeue_eff q=new queue_using_stacks_dequeue_eff();
		for (int i=1;i<=5;i++) {
			q.enqueue(i*10);
		}
		q.display();
		q.dequeue();
		q.display();
		System.out.println(q.front());
	}

}
