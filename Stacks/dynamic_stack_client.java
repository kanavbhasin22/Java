package stacks;

public class dynamic_stack_client {

	public static void main(String[] args) throws Exception {
		stack_as_array stack=new dynamic_stack(5);
		
		for(int i=10;i<=50;i+=10) {
			stack.push(i);
		}
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.display();
		System.out.println(stack.top());
		stack.pop();
		stack.display();
		System.out.println(stack.top());

	}

}
