package stacks;

public class queue_using_stack_enqueue {
	private dynamic_stack primary;
	private dynamic_stack secondary;

	public queue_using_stack_enqueue () throws Exception {
		this.primary=new dynamic_stack();
		this.secondary=new dynamic_stack();
	}
	
	public void enqueue(int item) throws Exception {
		this.primary.push(item);
	}
	
	public int size() {
		return this.primary.size();
	}
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	public int dequeue() throws Exception {
		while(primary.size()!=1) {
			secondary.push(primary.pop());
		}
		int rv=primary.pop();
		while(!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
		return rv;
	}
	public int front() throws Exception {
		while(primary.size()!=1) {
			secondary.push(primary.pop());
		}
		int rv=primary.top();
		while(!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
		return rv;
	}
	public void display() throws Exception{
		reverse_stack(primary,secondary,0);
		primary.display();
		reverse_stack(primary,secondary,0);
	}
	public static void reverse_stack(dynamic_stack stack, dynamic_stack helper,int index) throws Exception {
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
