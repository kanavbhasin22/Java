package queues;

public class queue_circular_array {
	protected int[] arr;
	protected int current_size;
	protected int max_size;
	protected int front ;
	private int rear;
	
	public static int defaultcap= 10;
	
	public queue_circular_array() {
		this(defaultcap);
	}
	public queue_circular_array(int n) {
		this.arr=new int[n];
		this.current_size=0;
		this.max_size=n;
		this.front=0;
		this.rear=n-1;
	}
	public int size() {
		return this.current_size;
	}
	public boolean isFull() {
		return this.current_size==this.max_size;
	}
	
	public boolean isEmpty() {
		return current_size==0;
	}
	public void enqueue(int data) {
		if(!this.isFull()) {
			this.rear=(this.rear +1)% this.arr.length;
			this.arr[this.rear]=data;
			this.current_size=this.current_size+1;
			}
	}
	
	public int dequeue() {
		if(!this.isEmpty()) {
			this.front=(this.front+1)% this.arr.length;
			this.current_size=this.current_size-1;
		}
		return this.front;
	}
	
	public int get_front() {
		return this.arr[this.front];
	}
	public void display() {
		for(int i=0;i<current_size;i++) {
			int idx=(i+front)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println("END");
	}
	public static void main(String[] args) {
		queue_circular_array queue=new queue_circular_array();
		for(int i=0;i<5;i++) {
			queue.enqueue(i);
		}
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(22);
		//while(!queue.isEmpty()) {
			//System.out.println(queue.get_front());
			//queue.dequeue();
		//}
		queue.display();
	}

}
