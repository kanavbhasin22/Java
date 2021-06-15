package linkedlist;

public class LL_as_stack_client {

	public static void main(String[] args) throws Exception {
		LL_as_stack stack=new LL_as_stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.display();
		
		stack.pop();
		stack.display();
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.top());
	}

}
