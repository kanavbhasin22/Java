package queues;

public class stack_using_queue_push_eff {
	private dy_queue primary=new dy_queue();
	private dy_queue secondary=new dy_queue();
	
	public int size() {
		return this.primary.current_size;
	}
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	public void push(int item) {
		this.primary.enqueue(item);
	}
	public int pop() {
		while(this.primary.current_size!=1) {
			this.secondary.enqueue((this.primary.dequeue()));
		}
		int ans= this.primary.dequeue();
		while(!this.secondary.isEmpty()) {
			this.primary.enqueue(this.secondary.dequeue());
		}
		return ans;
	}
	public int top() {
		while(this.primary.current_size!=1) {
			this.secondary.enqueue((this.primary.dequeue()));
		}
		int ans= this.primary.dequeue();
		this.secondary.enqueue(ans);
		while(!this.secondary.isEmpty()) {
			this.primary.enqueue(this.secondary.dequeue());
		}
		return ans;	
	}
	private void reverse(dy_queue q) {
		if(q.isEmpty()) {
			return;
		}
		int element=q.dequeue();
		reverse(q);
		q.enqueue(element);
	}
	public void display() {
		//reverse(this.primary);
		this.primary.display();
		reverse(this.primary);
	}
}
