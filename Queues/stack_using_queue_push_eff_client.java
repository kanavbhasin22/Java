package queues;

public class stack_using_queue_push_eff_client {

	public static void main(String[] args) {
		stack_using_queue_push_eff stack=new stack_using_queue_push_eff();
		for(int i=1;i<=11;i++) {
			stack.push(i);
		}
		System.out.println(stack.top());
		stack.display();
	}

}
