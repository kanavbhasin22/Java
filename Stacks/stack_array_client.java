package stacks;

public class stack_array_client {

	public static void main(String[] args) throws Exception{
		stack_as_array stack=new stack_as_array(10);
		
		for(int i=10;i<110;i+=10) {
			stack.push(i);
		}
		stack.display();
		System.out.println(stack.top());
		stack.pop();
		stack.display();
		System.out.println(stack.top());
	}

}
