package stacks;

public class queue_using_stacks_dequeue_eff {
	private dynamic_stack primary;
	private dynamic_stack secondary;
	
	public queue_using_stacks_dequeue_eff() throws Exception{
		this.primary=new dynamic_stack();
		this.secondary=new dynamic_stack();
	}
	
	public int size() {
		return this.primary.size();
	}
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	public void enqueue(int item) throws Exception{
		while(!primary.isEmpty()) {
			secondary.push(primary.pop());
		}
		primary.push(item);
		while(!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
	}
	
	public int dequeue() throws Exception {
		int data=this.primary.pop();
		return data;
	}
	
	public int front() throws Exception{
		return this.primary.top();
	}
	
	public void display() {
		this.primary.display();
	}
}
