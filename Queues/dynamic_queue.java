package queues;

public class dynamic_queue {
	private int capacity;
	static int[]arr;
	int front=0;
	int rear=-1;
	static int current_size=0;
	public static final int default_cap=5;
	
	public dynamic_queue() {
		this(default_cap);
	}
	
	public dynamic_queue(int capacity) {
		this.capacity=capacity;
		this.arr=new int[capacity];		
	}
	
	public void enqueue(int item) {
		if(this.isFull()) {
			increase_size();
		}
		else {
			this.rear++;
			if(this.size()==this.capacity) {
				this.rear=0;
			}
			else {
				this.arr[this.rear]=item;
				this.current_size++;
			}
		}
	}
	public void dequeue() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		else {
			this.front++;
			if(this.front==this.capacity-1) {
				this.front=0;
			}
		}
		this.current_size--;
	}
	
	public int front() {
		return this.arr[this.front];
	}
	
	public boolean isFull() {
		return current_size==capacity;
	}
	
	public boolean isEmpty() {
		return current_size==0;
	}
	
	public int size() {
		return current_size;
	}
	
	private void increase_size() {
		int newCapacity = this.arr.length*2;
        int[] newArr = new int[newCapacity];
        
        int tmpFront = front;
        int index = -1;
        while(true){
            newArr[++index] = this.arr[tmpFront];
            tmpFront++;
            if(tmpFront == this.arr.length){
                tmpFront = 0;
            }
            if(current_size == index+1){
                break;
            }
        }
        this.arr = newArr;
        System.out.println("New array capacity: "+this.arr.length);
        this.front = 0;
        this.rear = index;
    }
	
	public void display() {
		for(int i=this.front;i<this.capacity;i++) {
			System.out.println(this.arr[i]);
		}
		System.out.println("END");
	}
}