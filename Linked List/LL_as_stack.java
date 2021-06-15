package linkedlist;

public class LL_as_stack {
	Linkedlist stack=new Linkedlist();
	
	public int size() {
		return this.stack.size;
	}
	
	public boolean isEmpty() {
		return this.stack.size==0;
	}
	
	public void push (int data) {
		this.stack.addFirst(data);
	}
	
	public int pop() throws Exception {
		return this.stack.removeFirst();
	}
	
	public int top() throws Exception{
		return this.stack.getFirst();
	}
	public void display() {
		this.stack.display();
	}
}
