package stacks;

public class reverse_stack {

	public static void main(String[] args) throws Exception {
		stack_as_array stack=new stack_as_array(5);
		for(int i=10;i<=50;i+=10) {
			stack.push(i);
		}
		stack.display();
		stack_as_array helper=new stack_as_array(5);
		reverse_stack(stack,helper,0);
		stack.display();
	}
	public static void reverse_stack(stack_as_array stack, stack_as_array helper,int index) throws Exception {
		if(stack.isEmpty()) {
			return;
		}
		int item=stack.pop();
		reverse_stack(stack,helper,index+1);
		helper.push(item);
		if(index==0) {
			while(!helper.isEmpty()) {
			stack.push(helper.pop());
		}
	}
}
}